package com.hzu.translate.dao;

import com.hzu.translate.entity.UserTeam;
import com.hzu.translate.entity.UserTeamKey;

public interface UserTeamMapper {
    int deleteByPrimaryKey(UserTeamKey key);

    int insert(UserTeam record);

    int insertSelective(UserTeam record);

    UserTeam selectByPrimaryKey(UserTeamKey key);

    int updateByPrimaryKeySelective(UserTeam record);

    int updateByPrimaryKey(UserTeam record);
}