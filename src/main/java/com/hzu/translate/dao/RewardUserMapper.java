package com.hzu.translate.dao;

import com.hzu.translate.entity.RewardUser;
import com.hzu.translate.entity.RewardUserKey;
import com.hzu.translate.vo.RewardTranslationVo;

import java.util.List;

public interface RewardUserMapper {
    int deleteByPrimaryKey(RewardUserKey key);

    int insert(RewardUser record);

    int insertSelective(RewardUser record);

    RewardUser selectByPrimaryKey(RewardUserKey key);

    int updateByPrimaryKeySelective(RewardUser record);

    int updateByPrimaryKeyWithBLOBs(RewardUser record);

    int updateByPrimaryKey(RewardUser record);

    List<RewardUser> findRewardUserById(String userId);

    List<RewardTranslationVo> selectRewardTranslation(Long rewardId);

    int selectGetNumber(Long rewardId);
}