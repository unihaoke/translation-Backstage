package com.hzu.translate.controller;

import com.hzu.translate.common.Result;
import com.hzu.translate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //type 0为用户参加的，1为用户发起的
    @GetMapping(value = "/{userId}/{type}")
    public Result findUserReward(@PathVariable Long userId,@PathVariable Integer type){
        return userService.findUserReward(userId,type);
    }

}
