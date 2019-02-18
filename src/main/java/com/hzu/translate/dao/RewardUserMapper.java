package com.hzu.translate.dao;

import com.hzu.translate.entity.RewardUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RewardUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RewardUser record);

    int insertSelective(RewardUser record);

    RewardUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RewardUser record);

    int updateByPrimaryKeyWithBLOBs(RewardUser record);

    int updateByPrimaryKey(RewardUser record);

    List<RewardUser> findRewardUserById(Long userId);

    Long selectByUserIdAndRewardId(@Param("userId")Long userId,@Param("rewardId") Long rewardId);

    int updateSelective(RewardUser record);

}