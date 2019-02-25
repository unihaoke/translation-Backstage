package com.hzu.translate.service;

import com.hzu.translate.common.Result;

public interface UserService {
    Result findUserReward(Long userId,Integer type);

    Result findFavouritesReward(Long userId);
}
