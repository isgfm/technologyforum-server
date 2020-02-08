package com.guo.technologyforum.controller;

import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/forum")
public class ForumController {

    @Autowired
    ForumService forumService;

    @GetMapping("/state")
    public Result getForumState(){
        return Result.success(forumService.getForumStateVO());
    }
}
