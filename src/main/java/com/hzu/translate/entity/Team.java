package com.hzu.translate.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Team implements Serializable {
    private Long id;

    private Long userId;

    private String teamName;

    private Integer memberQuantity;

    private String organization;

    private String teamPic;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    private String teamDescribe;

    public Team(Long id, Long userId, String teamName, Integer memberQuantity, String organization, String teamPic, Date createdTime, Date updatedTime) {
        this.id = id;
        this.userId = userId;
        this.teamName = teamName;
        this.memberQuantity = memberQuantity;
        this.organization = organization;
        this.teamPic = teamPic;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Team(Long id, Long userId, String teamName, Integer memberQuantity, String organization, String teamPic, Date createdTime, Date updatedTime, String teamDescribe) {
        this.id = id;
        this.userId = userId;
        this.teamName = teamName;
        this.memberQuantity = memberQuantity;
        this.organization = organization;
        this.teamPic = teamPic;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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