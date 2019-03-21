package com.hzu.translate.vo;

public class RewardTranslationVo {
    private String userId;

    private Long rewardId;

    private String userName;

    private String translationFile;

    private String translation;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getRewardId() {
        return rewardId;
    }

    public void setRewardId(Long rewardId) {
        this.rewardId = rewardId;
    }

    public String getTranslationFile() {
        return translationFile;
    }

    public void setTranslationFile(String translationFile) {
        this.translationFile = translationFile;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
