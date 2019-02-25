package com.hzu.translate.service.impl;

import com.hzu.translate.common.Result;
import com.hzu.translate.common.StatusCode;
import com.hzu.translate.dao.RewardMapper;
import com.hzu.translate.dao.RewardUserMapper;
import com.hzu.translate.entity.Reward;
import com.hzu.translate.entity.RewardUser;
import com.hzu.translate.service.UserService;
import com.hzu.translate.vo.UserRewardVo;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private RewardMapper rewardMapper;
    @Autowired
    private RewardUserMapper rewardUserMapper;


    @Override
    public Result findUserReward(Long userId,Integer type) {
        if(userId == null){
            return new Result(false,StatusCode.ERROR,"查找失败");
        }
        return new Result(true,StatusCode.OK,"查询成功",getUserRewardVo(userId,type));
    }

    @Override
    public Result findFavouritesReward(Long userId) {
        if(userId == null){
            return new Result(false,StatusCode.ERROR,"查找失败");
        }
        return new Result(true,StatusCode.OK,"查询成功",getUserRewardVo(userId,2));
    }


    /**
     * 封装UserRewardVo
     * @param userId
     * @param type 0为用户参加的，1为用户发起的,2为用户关注
     * @return
     */
    private List<UserRewardVo> getUserRewardVo(Long userId, Integer type){
        List<UserRewardVo> userRewardVoList = new ArrayList<>();
        List<Reward> rewardList =null;
        if(type == 0 || type == 2){
            rewardList = rewardMapper.findAll(userId);
        }else if(type ==1){
            rewardList = rewardMapper.findRewardByUserId(userId);
        }
        if(CollectionUtils.isNotEmpty(rewardList)){
            for (Reward reward :rewardList){
                UserRewardVo userRewardVo = new UserRewardVo();
                userRewardVo.setId(reward.getId());
                userRewardVo.setCategoryId(reward.getCategoryId());
                userRewardVo.setDeadline(reward.getDeadline());
                userRewardVo.setRewardId(reward.getId());
                userRewardVo.setUserId(reward.getUserId());
                userRewardVo.setRewardExperience(reward.getRewardExperience());
                userRewardVo.setRewardInformation(reward.getRewardInformation());
                userRewardVo.setRewardMoney(reward.getRewardMoney());
                userRewardVo.setRewardSchedule(reward.getRewardSchedule());
                userRewardVo.setRewardStatus(reward.getRewardStatus());
                userRewardVo.setRewardType(reward.getRewardType());
                userRewardVo.setUploadFile(reward.getUploadFile());
                userRewardVo.setCreatedTime(reward.getCreatedTime());
                userRewardVo.setUpdatedTime(reward.getUpdatedTime());
                userRewardVo.setIsGet(0);
                userRewardVo.setIsAttention(0);
                List<RewardUser> rewardUserList = rewardUserMapper.findRewardUserById(userId);
                if(CollectionUtils.isNotEmpty(rewardUserList)){
                    for(RewardUser rewardUser : rewardUserList){
                        Integer isGet = rewardUser.getIsGet();
                        Integer isAttention = rewardUser.getIsAttention();
                        if(reward.getId() == rewardUser.getRewardId()){
                            userRewardVo.setIsAttention(rewardUser.getIsAttention());
                            userRewardVo.setIsGet(rewardUser.getIsGet());
                            if(isGet ==1 && type ==0){//如果是用户已领取的则添加进去
                                userRewardVoList.add(userRewardVo);
                            }else if(isAttention == 1&& type == 2){//用户关注的
                                userRewardVoList.add(userRewardVo);
                            }
                        }
                    }
                }
                if(type == 1){
                    userRewardVoList.add(userRewardVo);
                }
            }
        }
        return userRewardVoList;
    }
}
