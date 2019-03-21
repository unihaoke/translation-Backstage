package com.hzu.translate.entity;

import java.util.Date;

public class Team {
    private Long id;

    private String userId;

    private String teamName;

    private Integer memberQuantity;

    private String organization;

    private String teamPic;

    private Integer sortOrder;

    private Date createdTime;

    private Date updatedTime;

    private String teamDescribe;

    public Team(Long id, String userId, String teamName, Integer memberQuantity, String organization, String teamPic, Integer sortOrder, Date createdTime, Date updatedTime) {
        this.id = id;
        this.userId = userId;
        this.teamName = teamName;
        this.memberQuantity = memberQuantity;
        this.organization = organization;
        this.teamPic = teamPic;
        this.sortOrder = sortOrder;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Team(Long id, String userId, String teamName, Integer memberQuantity, String organization, String teamPic, Integer sortOrder, Date createdTime, Date updatedTime, String teamDescribe) {
        this.id = id;
        this.userId = userId;
        this.teamName = teamName;
        this.memberQuantity = memberQuantity;
        this.organization = organization;
        this.teamPic = teamPic;
        this.sortOrder = sortOrder;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.teamDescribe = teamDescribe;
    }

    public Team() {
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public Integer getMemberQuantity() {
        return memberQuantity;
    }

    public void setMemberQuantity(Integer memberQuantity) {
        this.memberQuantity = memberQuantity;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getTeamPic() {
        return teamPic;
    }

    public void setTeamPic(String teamPic) {
        this.teamPic = teamPic == null ? null : teamPic.trim();
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

    public String getTeamDescribe() {
        return teamDescribe;
    }

    public void setTeamDescribe(String teamDescribe) {
        this.teamDescribe = teamDescribe == null ? null : teamDescribe.trim();
    }
}