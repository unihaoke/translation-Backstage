package com.hzu.translate.entity;

import java.util.Date;

public class Notice {
    private Long id;

    private Long teamId;

    private String noticeTitle;

    private String publishName;

    private Date createdTime;

    private Date updatedTime;

    private String noticeContent;

    public Notice(Long id, Long teamId, String noticeTitle, String publishName, Date createdTime, Date updatedTime) {
        this.id = id;
        this.teamId = teamId;
        this.noticeTitle = noticeTitle;
        this.publishName = publishName;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Notice(Long id, Long teamId, String noticeTitle, String publishName, Date createdTime, Date updatedTime, String noticeContent) {
        this.id = id;
        this.teamId = teamId;
        this.noticeTitle = noticeTitle;
        this.publishName = publishName;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.noticeContent = noticeContent;
    }

    public Notice() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName == null ? null : publishName.trim();
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

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }
}