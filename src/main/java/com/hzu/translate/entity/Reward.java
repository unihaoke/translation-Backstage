package com.hzu.translate.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Reward {
    private Long id;

    private String userId;

    private Integer rewardStatus;

    private String rewardSchedule;

    private Integer rewardExperience;

    private Integer totalAttention;

    private Integer rewardType;

    private Integer rewardMoney;

    private String uploadFile;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date deadline;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    private String rewardInformation;

    public Reward(Long id, String userId, Integer rewardStatus, String rewardSchedule, Integer rewardExperience, Integer totalAttention, Integer rewardType, Integer rewardMoney, String uploadFile, Date deadline, Date createdTime, Date updatedTime) {
        this.id = id;
        this.userId = userId;
        this.rewardStatus = rewardStatus;
        this.rewardSchedule = rewardSchedule;
        this.rewardExperience = rewardExperience;
        this.totalAttention = totalAttention;
        this.rewardType = rewardType;
        this.rewardMoney = rewardMoney;
        this.uploadFile = uploadFile;
        this.deadline = deadline;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Reward(Long id, String userId, Integer rewardStatus, String rewardSchedule, Integer rewardExperience, Integer totalAttention, Integer rewardType, Integer rewardMoney, String uploadFile, Date deadline, Date createdTime, Date updatedTime, String rewardInformation) {
        this.id = id;
        this.userId = userId;
        this.rewardStatus = rewardStatus;
        this.rewardSchedule = rewardSchedule;
        this.rewardExperience = rewardExperience;
        this.totalAttention = totalAttention;
        this.rewardType = rewardType;
        this.rewardMoney = rewardMoney;
        this.uploadFile = uploadFile;
        this.deadline = deadline;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.rewardInformation = rewardInformation;
    }

    public Reward() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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
        this.rewardSchedule = rewardSchedule == null ? null : rewardSchedule.trim();
    }

    public Integer getRewardExperience() {
        return rewardExperience;
    }

    public void setRewardExperience(Integer rewardExperience) {
        this.rewardExperience = rewardExperience;
    }

    public Integer getTotalAttention() {
        return totalAttention;
    }

    public void setTotalAttention(Integer totalAttention) {
        this.totalAttention = totalAttention;
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
        this.uploadFile = uploadFile == null ? null : uploadFile.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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

    public String getRewardInformation() {
        return rewardInformation;
    }

    public void setRewardInformation(String rewardInformation) {
        this.rewardInformation = rewardInformation == null ? null : rewardInformation.trim();
    }
}