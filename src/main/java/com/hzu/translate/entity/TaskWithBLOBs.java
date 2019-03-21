package com.hzu.translate.entity;

import java.util.Date;

public class TaskWithBLOBs extends Task {
    private String taskDetails;

    private String taskTranslate;

    public TaskWithBLOBs(Long id, String userId, Long teamId, String taskTitle, Integer taskStatus, String taskGrouping, String sourceFile, String translateFile, Date taskDeadline, Integer taskType, String taskSchedule, Date createdTime, Date updatedTime, String taskDetails, String taskTranslate) {
        super(id, userId, teamId, taskTitle, taskStatus, taskGrouping, sourceFile, translateFile, taskDeadline, taskType, taskSchedule, createdTime, updatedTime);
        this.taskDetails = taskDetails;
        this.taskTranslate = taskTranslate;
    }

    public TaskWithBLOBs() {
        super();
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails == null ? null : taskDetails.trim();
    }

    public String getTaskTranslate() {
        return taskTranslate;
    }

    public void setTaskTranslate(String taskTranslate) {
        this.taskTranslate = taskTranslate == null ? null : taskTranslate.trim();
    }
}