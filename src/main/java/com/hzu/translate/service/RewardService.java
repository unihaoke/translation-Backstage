package com.hzu.translate.service;

import com.hzu.translate.common.Result;
import com.hzu.translate.entity.Reward;
import com.hzu.translate.entity.RewardUser;


public interface RewardService {

    Result findAll(String userId);

    Result updateGetAndAttention(RewardUser rewardUser);

    Result updateRewardTranslation(RewardUser rewardUser);

    Result addReward(Reward reward);

    Result findRewardByType(String userId,Long type);

}
