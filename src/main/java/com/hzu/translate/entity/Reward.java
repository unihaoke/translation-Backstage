package com.hzu.translate.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Reward implements Serializable {
    private Long id;

    private Long userId;

    private Integer rewardStatus;

    private String rewardSchedule;

    private Integer rewardExperience;

    private Long categoryId;

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

    public Reward(Long id, Long userId, Integer rewardStatus, String rewardSchedule, Integer rewardExperience, Long categoryId, Integer rewardType, Integer rewardMoney, String uploadFile, Date deadline, Date createdTime, Date updatedTime) {
        this.id = id;
        this.userId = userId;
        this.rewardStatus = rewardStatus;
        this.rewardSchedule = rewardSchedule;
        this.rewardExperience = rewardExperience;
        this.categoryId = categoryId;
        this.rewardType = rewardType;
        this.rewardMoney = rewardMoney;
        this.uploadFile = uploadFile;
        this.deadline = deadline;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Reward(Long id, Long userId, Integer rewardStatus, String rewardSchedule, Integer rewardExperience, Long categoryId, Integer rewardType, Integer rewardMoney, String uploadFile, Date deadline, Date createdTime, Date updatedTime, String rewardInformation) {
        this.id = id;
        this.userId = userId;
        this.rewardStatus = rewardStatus;
        this.rewardSchedule = rewardSchedule;
        this.rewardExperience = rewardExperience;
        this.categoryId = categoryId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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