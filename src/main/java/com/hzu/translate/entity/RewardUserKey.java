package com.hzu.translate.entity;

public class RewardUserKey {
    private String userId;

    private Long rewardId;

    public RewardUserKey(String userId, Long rewardId) {
        this.userId = userId;
        this.rewardId = rewardId;
    }

    public RewardUserKey() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getRewardId() {
        return rewardId;
    }

    public void setRewardId(Long rewardId) {
        this.rewardId = rewardId;
    }
}