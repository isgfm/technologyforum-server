package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.vo.ThemeReplyVO;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.NotifyService;
import com.guo.technologyforum.service.ThemeReplyService;
import com.guo.technologyforum.service.UserService;
import com.guo.technologyforum.util.CommonUtil;
import com.guo.technologyforum.util.UserUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "主题回复接口")
@RestController
@RequestMapping("api/themereply")
public class ThemeReplyController {

    @Autowired
    ThemeReplyService themeReplyService;

    @Autowired
    NotifyService notifyService;


    @ApiOperation(value = "根据主题id获得主题回复接口")
    @GetMapping("")
    public Result getThemeReply(@RequestParam("themeId")long themeId,@RequestParam("page")int page,@RequestParam("pageSize")int pageSize){
        ThemeReplyVO themeReplyVO = new ThemeReplyVO();
        themeReplyVO.setThemeReplyBOList(themeReplyService.getThemeReplyBOList(themeId,page,pageSize));
        themeReplyVO.setTotalReply(themeReplyService.countThemeReply(themeId));
        if(themeReplyVO.getTotalReply()>0)
            themeReplyVO.setLastThemeReply(themeReplyService.getLastThemeReply(themeId).get());
        return Result.success(themeReplyVO);
    }

    @ApiOperation(value = "回复主题")
    @PostMapping("reply")
    @RequireLogin(needUserStateNormal = true)
    public Result reply(@RequestBody ThemeReply themeReply){
        List<Long> userIdList = UserUtil.searchUserIdFromReplyContent(themeReply.getcReplyContent());
        User currentUser = UserUtil.currentUser().get();
        themeReply.setnUserId(currentUser.getnId());
        themeReply.setdReplyTime(CommonUtil.getNowDate());
        themeReply.setdLastupdateTime(CommonUtil.getNowDate());
        themeReplyService.addThemeReply(themeReply);

        notifyService.notifyCauseByThemeReply(userIdList,currentUser,themeReply.getnThemeId());
        return Result.success();
    }

}
