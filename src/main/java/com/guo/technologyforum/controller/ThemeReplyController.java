package com.guo.technologyforum.controller;

import com.guo.technologyforum.dao.entity.vo.ThemeReplyVO;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.ThemeReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/themereply")
public class ThemeReplyController {

    @Autowired
    ThemeReplyService themeReplyService;

    @GetMapping("")
    public Result getThemeReply(@RequestParam("themeId")long themeId,@RequestParam("page")int page,@RequestParam("pageSize")int pageSize){
        ThemeReplyVO themeReplyVO = new ThemeReplyVO();
        themeReplyVO.setThemeReplyBOList(themeReplyService.getThemeReplyBOList(themeId,page,pageSize));
        themeReplyVO.setTotalReply(themeReplyService.countThemeReply(themeId));
        if(themeReplyVO.getTotalReply()>0)
            themeReplyVO.setLastThemeReply(themeReplyService.getLastThemeReply(themeId).get());
        return Result.success(themeReplyVO);
    }

}
