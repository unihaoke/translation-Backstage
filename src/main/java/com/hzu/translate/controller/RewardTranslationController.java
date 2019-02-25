package com.hzu.translate.controller;

import com.hzu.translate.common.Result;
import com.hzu.translate.service.RewardTranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reward/translations")
public class RewardTranslationController {


    @Autowired
    private RewardTranslationService rewardTranslationService;

    @GetMapping(value = "/{rewardId}")
    public Result getRewardTranslationList(@PathVariable(value = "rewardId")Long rewardId){
        return rewardTranslationService.getRewardTranslationList(rewardId);
    }
}
