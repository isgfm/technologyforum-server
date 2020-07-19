package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.constant.NotifyConstant;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.vo.NotifyVO;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.NotifyService;
import com.guo.technologyforum.util.UserUtil;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-30 21:26
 **/
@RestController
@RequestMapping("api/notify")
public class NotifyController {
    @Autowired
    NotifyService notifyService;

    @GetMapping("/readed")
    @RequiresUser
    public Result getReadedNotify(){
        User user = UserUtil.currentUser().get();
        return Result.success(notifyService.getNotifyList(user.getnId(), NotifyConstant.READED));
    }

    @GetMapping("/unread")
    @RequiresUser
    public Result getUnreadedNotify(){
        User user = UserUtil.currentUser().get();
        return Result.success(notifyService.getNotifyList(user.getnId(), NotifyConstant.UNREAD));
    }

    @GetMapping("/list")
    @RequiresUser
    public Result getNotifyList(@RequestParam("page")int page,@RequestParam("pageSize")int pageSize){
        User user = UserUtil.currentUser().get();
        NotifyVO notifyVO = new NotifyVO();
        notifyVO.setNotifyBOList(notifyService.getNotifyList(user.getnId(),page,pageSize));
        notifyVO.setNotifyCount(notifyVO.getNotifyBOList().size()==0?0:notifyService.countNotifyByUserId(user.getnId()));
        return Result.success(notifyVO);
    }

    @PutMapping("/read/{notifyId}")
    @RequiresUser
    public Result readNotify(@PathVariable("notifyId")long notifyId){
        User user = UserUtil.currentUser().get();
        return Result.success(notifyService.read(user.getnId()));
    }

    @PutMapping("/readall")
    @RequiresUser
    public Result readAllNotify(){
        User user = UserUtil.currentUser().get();
        return Result.success(notifyService.readAll(user.getnId()));
    }

}
