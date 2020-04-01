package com.guo.technologyforum.service;

import com.guo.technologyforum.constant.NotifyConstant;
import com.guo.technologyforum.dao.entity.Notify;
import com.guo.technologyforum.dao.entity.NotifyExample;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.mapper.generateMapper.NotifyMapper;
import com.guo.technologyforum.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.tree.ReturnType;

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
        notify.setnSendUserId(currentUser.getnId());
        notify.setdCreateTime(CommonUtil.getNowDate());
        notify.setnNotifyType(NotifyConstant.NOTIFY_TYPE_THEME_MENTION);
        notify.setcMessage(String.valueOf(theme.getnId()));
        notify.setnReceiveUserId(theme.getnUserId());
        return notifyMapper.insert(notify);
    }

    public void addNotifyByMention(List<Long> userIdList, User currentUser,Long themeId){
        Notify notify = new Notify();
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

    public long countNotifyByUserId(long userId){
        NotifyExample example = new NotifyExample();
        NotifyExample.Criteria criteria = example.createCriteria();
        criteria.andNReceiveUserIdEqualTo(userId);
        return notifyMapper.countByExample(example);
    }
}
