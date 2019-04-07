package com.hzu.translate.vo;

import java.util.Date;

/**
 * 结合了用户和悬赏的抽象对象
 */
public class UserRewardVo2 {

    private String userId;

    private Long rewardId;

    private Integer isGet;

    private Integer isAttention;

    private Integer rewardStatus;

    private String rewardSchedule;

    private Integer rewardExperience;

    private Integer rewardType;

    private Integer totalAttention;

    private Integer rewardMoney;

    private String uploadFile;

    private Date deadline;

    private String rewardInformation;

    private String translation;

    private Integer is_Submission;

    private Date createdTime;

    private Date updatedTime;

    public Integer getTotalAttention() {
        return totalAttention;
    }

    public void setTotalAttention(Integer totalAttention) {
        this.totalAttention = totalAttention;
    }

    public Integer getIs_Submission() {
        return is_Submission;
    }

    public void setIs_Submission(Integer is_Submission) {
        this.is_Submission = is_Submission;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }


    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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

    public Integer getRewardStatus() {
        return rewardStatus;
    }

    public void setRewardStatus(Integer rewardStatus) {
        this.rewardStatus = rewardStatus;
    }

    public String getRewardSchedule() {
        return rewardSchedule;
    }

    public void setRewardSchedule(String rewardSchedule) {
        this.rewardSchedule = rewardSchedule;
    }

    public Integer getRewardExperience() {
        return rewardExperience;
    }

    public void setRewardExperience(Integer rewardExperience) {
        this.rewardExperience = rewardExperience;
    }

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getRewardMoney() {
        return rewardMoney;
    }

    public void setRewardMoney(Integer rewardMoney) {
        this.rewardMoney = rewardMoney;
    }

    public String getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getRewardInformation() {
        return rewardInformation;
    }

    public void setRewardInformation(String rewardInformation) {
        this.rewardInformation = rewardInformation;
    }
}
