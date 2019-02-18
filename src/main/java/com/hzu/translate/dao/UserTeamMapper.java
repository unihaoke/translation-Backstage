package com.hzu.translate.dao;

import com.hzu.translate.entity.UserTeam;

public interface UserTeamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserTeam record);

    int insertSelective(UserTeam record);

    UserTeam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserTeam record);

    int updateByPrimaryKey(UserTeam record);
}