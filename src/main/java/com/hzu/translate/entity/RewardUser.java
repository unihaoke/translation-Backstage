package com.hzu.translate.entity;

import java.io.Serializable;

public class RewardUser implements Serializable {
    private Long id;

    private Long userId;

    private Long rewardId;

    private Integer isGet;

    private Integer isAttention;

    private String translationFile;

    private String translation;

    public RewardUser(Long id, Long userId, Long rewardId, Integer isGet, Integer isAttention, String translationFile) {
        this.id = id;
        this.userId = userId;
        this.rewardId = rewardId;
        this.isGet = isGet;
        this.isAttention = isAttention;
        this.translationFile = translationFile;
    }

    public RewardUser(Long id, Long userId, Long rewardId, Integer isGet, Integer isAttention, String translationFile, String translation) {
        this.id = id;
        this.userId = userId;
        this.rewardId = rewardId;
        this.isGet = isGet;
        this.isAttention = isAttention;
        this.translationFile = translationFile;
        this.translation = translation;
    }

    public RewardUser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRewardId() {
        return rewardId;
    }

    public void setRewardId(Long rewardId) {
        this.rewardId = rewardId;
    }

    public Integer getIsGet() {
        return isGet;
    }

    public void setIsGet(Integer isGet) {
        this.isGet = isGet;
    }

    public Integer getIsAttention() {
        return isAttention;
    }

    public void setIsAttention(Integer isAttention) {
        this.isAttention = isAttention;
    }

    public String getTranslationFile() {
        return translationFile;
    }

    public void setTranslationFile(String translationFile) {
        this.translationFile = translationFile == null ? null : translationFile.trim();
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation == null ? null : translation.trim();
    }
}