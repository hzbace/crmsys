package com.qianfeng.pojo;

public class Right {
    private Integer rightId;

    private Integer rightParentId;

    private String rightName;

    private String rightUrl;

    private String rightFlag;

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getRightParentId() {
        return rightParentId;
    }

    public void setRightParentId(Integer rightParentId) {
        this.rightParentId = rightParentId;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName == null ? null : rightName.trim();
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl == null ? null : rightUrl.trim();
    }

    public String getRightFlag() {
        return rightFlag;
    }

    public void setRightFlag(String rightFlag) {
        this.rightFlag = rightFlag == null ? null : rightFlag.trim();
    }
}