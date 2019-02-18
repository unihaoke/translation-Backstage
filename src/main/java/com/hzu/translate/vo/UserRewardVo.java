package com.hzu.translate.vo;

import java.util.Date;

/**
 * 结合了用户和悬赏的抽象对象
 */
public class UserRewardVo {

    private Long Id;

    private Long userId;

    private Long rewardId;

    private Integer isGet;

    private Integer isAttention;

    private Integer rewardStatus;

    private String rewardSchedule;

    private Integer rewardExperience;

    private Long categoryId;

    private Integer rewardType;

    private Integer rewardMoney;

    private String uploadFile;

    private Date deadline;

    private String rewardInformation;

    private Date createdTime;

    private Date updatedTime;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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
