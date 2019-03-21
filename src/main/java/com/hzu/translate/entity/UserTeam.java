package com.hzu.translate.entity;

public class UserTeam extends UserTeamKey {
    private Integer newData;

    public UserTeam(String userId, Long teamId, Integer newData) {
        super(userId, teamId);
        this.newData = newData;
    }

    public UserTeam() {
        super();
    }

    public Integer getNewData() {
        return newData;
    }

    public void setNewData(Integer newData) {
        this.newData = newData;
    }
}