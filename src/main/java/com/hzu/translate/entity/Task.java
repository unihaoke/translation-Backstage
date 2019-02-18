package com.hzu.translate.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    private Long id;

    private Long teamId;

    private String taskTitle;

    private Integer taskStatus;

    private String taskGrouping;

    private String sourceFile;

    private String translateFile;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskDeadline;

    private Integer taskType;

    private String taskSchedule;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

    public Task(Long id, Long teamId, String taskTitle, Integer taskStatus, String taskGrouping, String sourceFile, String translateFile, Date taskDeadline, Integer taskType, String taskSchedule, Date createdTime, Date updatedTime) {
        this.id = id;
        this.teamId = teamId;
        this.taskTitle = taskTitle;
        this.taskStatus = taskStatus;
        this.taskGrouping = taskGrouping;
        this.sourceFile = sourceFile;
        this.translateFile = translateFile;
        this.taskDeadline = taskDeadline;
        this.taskType = taskType;
        this.taskSchedule = taskSchedule;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Task() {
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

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskGrouping() {
        return taskGrouping;
    }

    public void setTaskGrouping(String taskGrouping) {
        this.taskGrouping = taskGrouping == null ? null : taskGrouping.trim();
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile == null ? null : sourceFile.trim();
    }

    public String getTranslateFile() {
        return translateFile;
    }

    public void setTranslateFile(String translateFile) {
        this.translateFile = translateFile == null ? null : translateFile.trim();
    }

    public Date getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(Date taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getTaskSchedule() {
        return taskSchedule;
    }

    public void setTaskSchedule(String taskSchedule) {
        this.taskSchedule = taskSchedule == null ? null : taskSchedule.trim();
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