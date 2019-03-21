package com.hzu.translate.entity;

import java.util.Date;

public class RewardCategory {
    private Long id;

    private Long rewardId;

    private String categoryName;

    private Long parentId;

    private Integer status;

    private Integer sortOrder;

    private Date createdTime;

    private Date updatedTime;

    public RewardCategory(Long id, Long rewardId, String categoryName, Long parentId, Integer status, Integer sortOrder, Date createdTime, Date updatedTime) {
        this.id = id;
        this.rewardId = rewardId;
        this.categoryName = categoryName;
        this.parentId = parentId;
        this.status = status;
        this.sortOrder = sortOrder;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public RewardCategory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRewardId() {
        return rewardId;
    }

    public void setRewardId(Long rewardId) {
        this.rewardId = rewardId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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
}