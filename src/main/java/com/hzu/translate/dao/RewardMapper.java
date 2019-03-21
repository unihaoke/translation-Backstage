package com.hzu.translate.dao;

import com.hzu.translate.entity.Reward;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RewardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Reward record);

    int insertSelective(Reward record);

    Reward selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Reward record);

    int updateByPrimaryKeyWithBLOBs(Reward record);

    int updateByPrimaryKey(Reward record);

    List<Reward> findAll();

    List<Reward> findRewardByType(Long type);

    List<Reward> findRewardByUserId(String userId);

    List<Reward> findRewardByFreeMoney();

    List<Reward> findRewardByMoney();
}