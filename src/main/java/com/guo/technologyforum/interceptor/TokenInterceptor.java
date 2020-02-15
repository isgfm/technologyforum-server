package com.guo.technologyforum.interceptor;

import com.guo.technologyforum.shiro.ShiroRedisDAO;
import com.guo.technologyforum.shiro.ShiroSessionManager;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * session超时 通知前端删除token
 */
@Component
public class TokenInterceptor extends HandlerInterceptorAdapter {

    private static final String SESSION_TIME_OUT_K = "SESSION_TIME_OUT";
    private static final String SESSION_TIME_OUT_V = "timeout";

    @Autowired
    private ShiroRedisDAO shiroRedisDAO;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader(ShiroSessionManager.OAUTH_TOKEN);

        if (null != token) {
            Session s = shiroRedisDAO.get(token, Session.class);

            if (null == s || null == s.getId()) {
                response.setHeader(SESSION_TIME_OUT_K, SESSION_TIME_OUT_V);
            }
        }

        return super.preHandle(request, response, handler);
    }
}
