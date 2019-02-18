package com.hzu.translate.dao;

import com.hzu.translate.entity.RewardCategory;

public interface RewardCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RewardCategory record);

    int insertSelective(RewardCategory record);

    RewardCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RewardCategory record);

    int updateByPrimaryKey(RewardCategory record);
}