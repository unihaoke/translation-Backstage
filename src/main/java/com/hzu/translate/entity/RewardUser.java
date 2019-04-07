package com.hzu.translate.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RewardUser extends RewardUserKey {
    private Integer isGet;

    private Integer isAttention;

    private Integer isAdopt;

    private Integer isSubmission;

    private Integer sortOrder;

    private String translationFile;

    private String translation;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    public RewardUser(String userId, Long rewardId, Integer isGet, Integer isAttention, Integer isAdopt, Integer isSubmission, Integer sortOrder, String translationFile,Date updatedTime) {
        super(userId, rewardId);
        this.isGet = isGet;
        this.isAttention = isAttention;
        this.isAdopt = isAdopt;
        this.isSubmission = isSubmission;
        this.sortOrder = sortOrder;
        this.translationFile = translationFile;
        this.updatedTime = updatedTime;
    }

    public RewardUser(String userId, Long rewardId, Integer isGet, Integer isAttention, Integer isAdopt, Integer isSubmission, Integer sortOrder, String translationFile, String translation ,Date updatedTime) {
        super(userId, rewardId);
        this.isGet = isGet;
        this.isAttention = isAttention;
        this.isAdopt = isAdopt;
        this.isSubmission = isSubmission;
        this.sortOrder = sortOrder;
        this.translationFile = translationFile;
        this.translation = translation;
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public RewardUser() {
        super();
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

    public Integer getIsAdopt() {
        return isAdopt;
    }

    public void setIsAdopt(Integer isAdopt) {
        this.isAdopt = isAdopt;
    }

    public Integer getIsSubmission() {
        return isSubmission;
    }

    public void setIsSubmission(Integer isSubmission) {
        this.isSubmission = isSubmission;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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