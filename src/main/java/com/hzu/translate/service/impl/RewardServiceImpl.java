package com.hzu.translate.service.impl;

import com.hzu.translate.common.Result;
import com.hzu.translate.common.StatusCode;
import com.hzu.translate.dao.RewardUserMapper;
import com.hzu.translate.entity.Reward;
import com.hzu.translate.dao.RewardMapper;
import com.hzu.translate.entity.RewardUser;
import com.hzu.translate.service.RewardService;
import com.hzu.translate.vo.UserRewardVo;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * 悬赏类
 */

@Service
@Transactional
public class RewardServiceImpl implements RewardService {

    @Autowired
    private RewardMapper rewardMapper;
    @Autowired
    private RewardUserMapper rewardUserMapper;

    @Override
    public Result findAll(String userId) {
        if(userId == null){
            return new Result(false,StatusCode.ERROR,"查找失败");
        }
        return new Result(true,StatusCode.OK,"查询成功",getUserRewardVo(userId,null));
    }

    @Override
    public Result updateGetAndAttention(RewardUser rewardUser) {
        if(rewardUser == null){
            return new Result(false,StatusCode.ERROR,"更新失败");
        }
        int sCount = rewardUserMapper.selectGetNumber(rewardUser.getRewardId());
        if(sCount > 2){
            return new Result(false,StatusCode.ERROR,"悬赏已被接完");
        }
        int rowCount = rewardUserMapper.updateByPrimaryKeySelective(rewardUser);
        if(rowCount >0){
                return new Result(true,StatusCode.OK,"更新成功");
            }
        int count = rewardUserMapper.insert(rewardUser);
        if(count > 0){
            return new Result(true,StatusCode.OK,"添加成功");
        }
        return new Result(false,StatusCode.ERROR,"添加失败");
    }

    @Override
    public Result updateRewardTranslation(RewardUser rewardUser) {
        if(rewardUser == null){
            return new Result(false,StatusCode.ERROR,"提交失败");
        }
        rewardUser.setIsSubmission(1);
        int rowCount = rewardUserMapper.updateByPrimaryKeySelective(rewardUser);
        if(rowCount >0){
            return new Result(true,StatusCode.OK,"提交成功");
        }
        return new Result(false,StatusCode.ERROR,"提交失败");
    }

    @Override
    public Result addReward(Reward reward) {
        if(reward == null){
            return new Result(false,StatusCode.ERROR,"添加失败");
        }
        return new Result(true,StatusCode.OK,"添加成功",rewardMapper.insert(reward));
    }

    @Override
    public Result findRewardByType(String userId, Long type) {//type类型-1为免费，0为收费，1为计算机，2为金融，3为体育
        if(userId == null ){
            return new Result(false,StatusCode.ERROR,"查找失败");
        }
        return new Result(true,StatusCode.OK,"查询成功",getUserRewardVo(userId,type));
    }









    /**
     * 封装UserRewardVo
     * @param userId
     * @return
     */
    private List<UserRewardVo> getUserRewardVo(String userId,Long type){
        List<UserRewardVo> userRewardVoList = new ArrayList<>();
        List<Reward> rewardList =null;
        if(type == null){
            rewardList = rewardMapper.findAll();
        }else if(type.intValue() == -1){
            rewardList = rewardMapper.findRewardByFreeMoney();
        }else if(type.intValue() == 0){
            rewardList = rewardMapper.findRewardByMoney();
        }else{
            rewardList = rewardMapper.findRewardByType(type);
        }
        if(CollectionUtils.isNotEmpty(rewardList)){
            for (Reward reward :rewardList){
                UserRewardVo userRewardVo = new UserRewardVo();
                userRewardVo.setDeadline(reward.getDeadline());
                userRewardVo.setRewardId(reward.getId());
                userRewardVo.setUserId(reward.getUserId());
                userRewardVo.setTotal_attention(reward.getTotalAttention());
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
                        if(reward.getId() == rewardUser.getRewardId()){
                            userRewardVo.setIsAttention(rewardUser.getIsAttention());
                            userRewardVo.setIsGet(rewardUser.getIsGet());
                        }
                    }
                }
                userRewardVoList.add(userRewardVo);
            }
        }
        return userRewardVoList;
    }
}
