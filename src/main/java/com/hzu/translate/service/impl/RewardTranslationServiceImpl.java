package com.hzu.translate.service.impl;

import com.hzu.translate.common.Result;
import com.hzu.translate.common.StatusCode;
import com.hzu.translate.dao.RewardUserMapper;
import com.hzu.translate.service.RewardTranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RewardTranslationServiceImpl implements RewardTranslationService {

    @Autowired
    private RewardUserMapper rewardUserMapper;

    @Override
    public Result getRewardTranslationList( Long rewardId) {
        if(rewardId == null){
            return new Result(false,StatusCode.ERROR,"查找失败");
        }
        return new Result(true,StatusCode.OK,"查询成功",rewardUserMapper.selectRewardTranslation(rewardId));
    }
}
