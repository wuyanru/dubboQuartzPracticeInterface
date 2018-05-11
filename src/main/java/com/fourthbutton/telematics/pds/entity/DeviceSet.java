package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

public class DeviceSet {
    private String deviceSetId;
    private String setType;
    private String recordStatus;
    private Date createTime;
    private Date updateTime;
    private String userId;

    public String getDeviceSetId() {
        return deviceSetId;
    }

    public void setDeviceSetId(String deviceSetId) {
        this.deviceSetId = deviceSetId;
    }

    public String getSetType() {
        return setType;
    }

    public void setSetType(String setType) {
        this.setType = setType;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "DeviceSet [deviceSetId=" + deviceSetId + ", setType=" + setType + ", recordStatus=" + recordStatus + ", createTime=" + createTime + ", updateTime=" + updateTime + ", userId=" + userId + "]";
    }


}
