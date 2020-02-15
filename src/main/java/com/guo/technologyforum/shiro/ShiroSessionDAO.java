package com.guo.technologyforum.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.ValidatingSession;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class ShiroSessionDAO extends CachingSessionDAO {

    private static Logger logger = LoggerFactory.getLogger(ShiroSessionDAO.class);

    @Autowired
    private ShiroRedisDAO redisManager;

    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = generateSessionId(session);
        assignSessionId(session, sessionId);
        logger.info("create:"+sessionId.toString());

        redisManager.set(sessionId.toString(), session, ShiroRedisDAO.DEFAULT_EXPIRE);
        return sessionId;
    }

    public void setRedisManager(ShiroRedisDAO redisManager) {
        this.redisManager = redisManager;
    }

    @Override
    protected void doUpdate(Session session) {
        if (session instanceof ValidatingSession && !((ValidatingSession) session).isValid()) {
            return; //如果会话过期/停止 没必要再更新了
        }
        logger.info("update:"+session.getId().toString());
        redisManager.set(session.getId().toString(), session, ShiroRedisDAO.DEFAULT_EXPIRE);
    }

    @Override
    protected void doDelete(Session session) {
        redisManager.delete(session.getId().toString());
    }


    @Override
    protected Session doReadSession(Serializable sessionId) {
        logger.info("doReadSession:"+sessionId.toString());
        return redisManager.get(sessionId.toString(), Session.class);
    }
}
