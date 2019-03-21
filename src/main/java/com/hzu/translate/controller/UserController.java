package com.hzu.translate.controller;

import com.hzu.translate.common.Result;
import com.hzu.translate.entity.User;
import com.hzu.translate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //type 0为用户参加的，1为用户发起的
    @GetMapping(value = "/translations/{userId}/{type}")
    public Result findUserReward(@PathVariable String userId,@PathVariable Integer type){
        return userService.findUserReward(userId,type);
    }

    @GetMapping(value = "/favourites/{userId}")
    public Result findFavouritesReward(@PathVariable String userId){
        return userService.findFavouritesReward(userId);
    }

    @PostMapping
    public Result addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping(value = "/decodeUserInfo")
    public Result decodeUserInfo(@RequestBody Map<String,Object> params){
        return userService.getUserId(params.get("username").toString(),params.get("code").toString());
    }

    @PutMapping
    public Result updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping(value = "/{userId}")
    public Result findUser(@PathVariable String userId){
        return userService.findUserById(userId);
    }
}
