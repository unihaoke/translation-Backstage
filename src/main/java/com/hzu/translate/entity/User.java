package com.hzu.translate.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private String userName;

    private String email;

    private String profession;

    private String userLevel;

    private Long currentExperience;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    public User(Long id, String userName, String email, String profession, String userLevel, Long currentExperience, Date createdTime, Date updatedTime) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.profession = profession;
        this.userLevel = userLevel;
        this.currentExperience = currentExperience;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    public Long getCurrentExperience() {
        return currentExperience;
    }

    public void setCurrentExperience(Long currentExperience) {
        this.currentExperience = currentExperience;
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