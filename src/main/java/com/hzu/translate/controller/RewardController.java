package com.hzu.translate.controller;

import com.hzu.translate.common.Result;
import com.hzu.translate.entity.Reward;
import com.hzu.translate.entity.RewardUser;
import com.hzu.translate.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reward")
public class RewardController {

    @Autowired
    private RewardService rewardService;


    @GetMapping(value = "/{userId}")
    public Result rewardList(@PathVariable Long userId){
        return rewardService.findAll(userId);
    }

    @PutMapping
    public Result updateGetAndAttention(@RequestBody RewardUser rewardUser){
        return rewardService.updateGetAndAttention(rewardUser);
    }

    @PutMapping("/translation")
    public Result submitTranslation(@RequestBody RewardUser rewardUser){
        return rewardService.updateRewardTranslation(rewardUser);
    }

    @PostMapping
    public Result addReward(@RequestBody Reward reward){
        return rewardService.addReward(reward);
    }

    @GetMapping(value = "/{userId}/{type}")
    public Result findReward(@PathVariable Long userId,@PathVariable Long type){//type类型1为免费，2为收费，3为计算机，4为金融，5为体育
        return rewardService.findRewardByType(userId,type);
    }
}
