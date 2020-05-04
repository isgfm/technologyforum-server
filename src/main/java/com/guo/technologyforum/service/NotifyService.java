package com.guo.technologyforum.service;

import com.guo.technologyforum.constant.NotifyConstant;
import com.guo.technologyforum.dao.entity.Notify;
import com.guo.technologyforum.dao.entity.NotifyExample;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.bo.NotifyBO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomNotifyMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.NotifyMapper;
import com.guo.technologyforum.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-15 22:13
 **/
@Service
public class NotifyService {
    @Autowired
    NotifyMapper notifyMapper;

    @Autowired
    ThemeService themeService;

    @Autowired
    CustomNotifyMapper customNotifyMapper;

    public void notifyCauseByThemeReply(List<Long> userIdList, User currentUser,Long themeId){
        //提醒@的人
        if(userIdList.size()>0)
            addNotifyByMention(userIdList,currentUser,themeId);

        //提醒发布主题的人
        Theme theme = themeService.getThemeByThemeId(themeId).get();
        if(theme.getnUserId() != currentUser.getnId())
            addNotifyByThemeReply(currentUser,theme);
    }

    public int addNotifyByThemeReply(User currentUser,Theme theme){
        Notify notify = new Notify();
        notify.setbStatus(NotifyConstant.UNREAD);
        notify.setnThemeId(theme.getnId());
        notify.setnSendUserId(currentUser.getnId());
        notify.setdCreateTime(CommonUtil.getNowDate());
        notify.setnNotifyType(NotifyConstant.NOTIFY_TYPE_THEME_MENTION);
        notify.setcMessage(String.valueOf(theme.getnId()));
        notify.setnReceiveUserId(theme.getnUserId());
        return notifyMapper.insert(notify);
    }

    public void addNotifyByMention(List<Long> userIdList, User currentUser,Long themeId){
        Notify notify = new Notify();
        notify.setbStatus(NotifyConstant.UNREAD);
        notify.setnSendUserId(currentUser.getnId());
        notify.setdCreateTime(CommonUtil.getNowDate());
        notify.setnNotifyType(NotifyConstant.NOTIFY_TYPE_THEME_MENTION);
        notify.setcMessage(String.valueOf(themeId));
        for(Long userId:userIdList){
            notify.setnSendUserId(userId);
            addNotify(notify);
        }
    }

    public int addNotify(Notify notify){
        return notifyMapper.insert(notify);
    }

    public long countNotifyByUserId(long userId,boolean readStatus){
        NotifyExample example = new NotifyExample();
        NotifyExample.Criteria criteria = example.createCriteria();
        criteria.andNReceiveUserIdEqualTo(userId);
        criteria.andBStatusEqualTo(readStatus);
        return notifyMapper.countByExample(example);
    }

    public long countNotifyByUserId(long userId){
        NotifyExample example = new NotifyExample();
        NotifyExample.Criteria criteria = example.createCriteria();
        criteria.andNReceiveUserIdEqualTo(userId);
        return notifyMapper.countByExample(example);
    }

    public List<Notify> getNotifyList(long userId,boolean readStatus){
        NotifyExample example = new NotifyExample();
        NotifyExample.Criteria criteria = example.createCriteria();
        criteria.andNReceiveUserIdEqualTo(userId);
        criteria.andBStatusEqualTo(readStatus);
        example.setOrderByClause("d_create_time desc");
        return notifyMapper.selectByExample(example);
    }

    /**
     * TODO 获得所有提醒（包括主题和发送提醒用户信息）
     * @param userId
     * @return java.util.List<com.guo.technologyforum.dao.entity.vo.NotifyVO>
     */
    public List<NotifyBO> getNotifyList(long userId,int page,int pageSize){
        return customNotifyMapper.getNotifyVOList(userId,pageSize,pageSize*(page-1));
    }

    public int read(long notifyId){
        Notify notify = new Notify();
        notify.setnId(notifyId);
        notify.setdReadTime(CommonUtil.getNowDate());
        notify.setbStatus(NotifyConstant.READED);
        return notifyMapper.updateByPrimaryKeySelective(notify);
    }

    public int readAll(long userId){
        Notify notify = new Notify();
        notify.setbStatus(NotifyConstant.READED);
        notify.setdReadTime(CommonUtil.getNowDate());
        NotifyExample example = new NotifyExample();
        NotifyExample.Criteria criteria = example.createCriteria();
        criteria.andNReceiveUserIdEqualTo(userId);
        return notifyMapper.updateByExampleSelective(notify,example);
    }
}
