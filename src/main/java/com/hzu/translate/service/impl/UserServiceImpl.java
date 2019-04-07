package com.hzu.translate.service.impl;

import com.hzu.translate.common.Result;
import com.hzu.translate.common.StatusCode;
import com.hzu.translate.dao.RewardMapper;
import com.hzu.translate.dao.RewardUserMapper;
import com.hzu.translate.dao.UserMapper;
import com.hzu.translate.entity.Reward;
import com.hzu.translate.entity.RewardUser;
import com.hzu.translate.entity.User;
import com.hzu.translate.service.UserService;
import com.hzu.translate.utils.HttpRequest;
import com.hzu.translate.vo.UserRewardVo;
import net.sf.json.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
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
    @Autowired
    private UserMapper userMapper;


    @Override
    public Result findUserReward(String userId,Integer type) {
        if(userId == null){
            return new Result(false,StatusCode.ERROR,"查找失败");
        }
        return new Result(true,StatusCode.OK,"查询成功",getUserRewardVo(userId));
    }

    @Override
    public Result findFavouritesReward(String userId) {
        if(userId == null){
            return new Result(false,StatusCode.ERROR,"查找失败");
        }
        return new Result(true,StatusCode.OK,"查询成功",getUserRewardVo(userId));
    }

    @Override
    public Result addUser(User user) {
        if(user == null){
            return new Result(false,StatusCode.ERROR,"添加失败");
        }
        return new Result(true,StatusCode.OK,"更新成功",userMapper.insertSelective(user));
    }

    @Override
    public Result getUserId(String username, String code) {

        // 登录凭证不能为空
        if (code == null || code.length() == 0) {
            return new Result(false,StatusCode.ERROR,"查询失败");
        }
        // 小程序唯一标识 (在微信小程序管理后台获取)
        String wxspAppid = "wxe0d156a5aac77e36";
        // 小程序的 app secret (在微信小程序管理后台获取)
        String wxspSecret = "9a59467bbc96e5a99bdfedf1be63e087";
        // 授权（必填）
        String grant_type = "authorization_code";
        //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid
        //////////////// ////////////////
        // 请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type="
                + grant_type;
        // 发送请求
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        // 解析相应内容（转换成json对象）
        JSONObject json = JSONObject.fromObject(sr);
        System.out.println(json.toString());
        // 获取会话密钥（session_key）
//        String session_key = json.get("session_key").toString();
        // 用户的唯一标识（openid）
        String openid = (String) json.get("openid");
        //////////////// 2、对encryptedData加密数据进行AES解密 ////////////////
//        try {
//            String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
//            if (null != result && result.length() > 0) {
//                map.put("status", 1);
//                map.put("msg", "解密成功");
//
//                JSONObject userInfoJSON = JSONObject.fromObject(result);
//                Map userInfo = new HashMap();
//                userInfo.put("openId", userInfoJSON.get("openId"));
//                userInfo.put("nickName", userInfoJSON.get("nickName"));
//                userInfo.put("gender", userInfoJSON.get("gender"));
//                userInfo.put("city", userInfoJSON.get("city"));
//                userInfo.put("province", userInfoJSON.get("province"));
//                userInfo.put("country", userInfoJSON.get("country"));
//                userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
//                // 解密unionId & openId;
//
//                userInfo.put("unionId", userInfoJSON.get("unionId"));
//                map.put("userInfo", userInfo);
//            } else {
//                map.put("status", 0);
//                map.put("msg", "解密失败");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("userId:"+openid);
        if(StringUtils.isEmpty(openid)){
            return new Result(false,StatusCode.ERROR,"请求失败");
        }

        int count = userMapper.selectUserId(openid);
        if (count == 0){
            User user = new User();
            user.setId(openid);
            user.setUserName(username);
            userMapper.insert(user);
        }
        return new Result(true,StatusCode.OK,"请求成功",openid);
    }

    @Override
    public Result updateUser(User user) {
        if(user == null){
            return new Result(false,StatusCode.ERROR,"更新失败");
        }
        return new Result(true,StatusCode.OK,"更新成功",userMapper.updateByPrimaryKeySelective(user));
    }

    @Override
    public Result findUserById(String userId) {
        if(userId == null){
            return new Result(false,StatusCode.ERROR,"查找失败");
        }
        return new Result(true,StatusCode.OK,"查询成功",userMapper.selectByPrimaryKey(userId));
    }






    /**
     * 封装UserRewardVo
     * @param userId
     * @return
     */
    private List<UserRewardVo> getUserRewardVo(String userId){
        List<UserRewardVo> userRewardVoList = new ArrayList<>();
        List<Reward> rewardList =rewardMapper.findAll();
        if(CollectionUtils.isNotEmpty(rewardList)){
            for (Reward reward :rewardList){
                List<RewardUser> rewardUserList = rewardUserMapper.findRewardUserById(userId);
                if(CollectionUtils.isNotEmpty(rewardUserList)){
                    for(RewardUser rewardUser : rewardUserList){
                        if(reward.getId() == rewardUser.getRewardId() &&!reward.getUserId().equals(userId)){
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
                            userRewardVo.setIsAttention(rewardUser.getIsAttention());
                            userRewardVo.setIsGet(rewardUser.getIsGet());
                            userRewardVo.setIs_Submission(rewardUser.getIsSubmission());
                            userRewardVo.setIs_adopt(rewardUser.getIsAdopt());
                            userRewardVo.setTranslation(rewardUser.getTranslation());
                            userRewardVoList.add(userRewardVo);
                        }
                    }
                }
                if(reward.getUserId().equals(userId)){
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
                    userRewardVo.setIsAttention(0);
                    userRewardVo.setIsGet(0);
                    userRewardVo.setIs_Submission(0);
                    userRewardVo.setIs_adopt(0);
                    userRewardVoList.add(userRewardVo);
                }

            }
        }
        return userRewardVoList;
    }
}
