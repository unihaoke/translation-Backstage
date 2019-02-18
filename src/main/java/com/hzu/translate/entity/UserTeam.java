package com.hzu.translate.entity;

import java.io.Serializable;

public class UserTeam implements Serializable {
    private Long id;

    private Long userId;

    private Long teamId;

    public UserTeam(Long id, Long userId, Long teamId) {
        this.id = id;
        this.userId = userId;
        this.teamId = teamId;
    }

    public UserTeam() {
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

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}