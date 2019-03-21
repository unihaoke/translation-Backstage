package com.hzu.translate.service;

import com.hzu.translate.common.Result;
import com.hzu.translate.entity.User;

public interface UserService {
    Result findUserReward(String userId,Integer type);

    Result findFavouritesReward(String userId);

    Result addUser(User user);

    Result getUserId(String username, String code);

    Result updateUser(User user);

    Result findUserById(String userId);
}
