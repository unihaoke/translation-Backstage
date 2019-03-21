package com.hzu.translate.entity;

public class UserTeamKey {
    private String userId;

    private Long teamId;

    public UserTeamKey(String userId, Long teamId) {
        this.userId = userId;
        this.teamId = teamId;
    }

    public UserTeamKey() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}