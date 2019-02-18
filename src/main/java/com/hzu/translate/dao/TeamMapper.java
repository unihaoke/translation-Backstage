package com.hzu.translate.dao;

import com.hzu.translate.entity.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKeyWithBLOBs(Team record);

    int updateByPrimaryKey(Team record);
}