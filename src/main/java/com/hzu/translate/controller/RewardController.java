package com.hzu.translate.controller;

import com.hzu.translate.common.Result;
import com.hzu.translate.entity.Reward;
import com.hzu.translate.entity.RewardUser;
import com.hzu.translate.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/reward")
public class RewardController {

    @Autowired
    private RewardService rewardService;


    @GetMapping(value = "/{userId}")
    public Result rewardList(@PathVariable String userId){
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
    public Result findReward(@PathVariable String userId,@PathVariable Long type){//type类型1为免费，2为收费，3为计算机，4为金融，5为体育
        return rewardService.findRewardByType(userId,type);
    }

    @PostMapping("/upload")

    public Result addRewardAndFile( Reward reward ,@RequestParam("file") MultipartFile file){
        return rewardService.addRewardAndFile(reward,file);
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}
