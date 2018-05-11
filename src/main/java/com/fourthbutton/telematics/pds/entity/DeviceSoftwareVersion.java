package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

public class DeviceSoftwareVersion extends AbstractObject {

    /**
	 * 
	 */
    private static final long serialVersionUID = 5825331455645788787L;

    private String swId;

    private String swVersion;

    private String swDescript;

    private String deviceType;

    private String protocalHeaderVersion;

    private String protocalVersion;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    public String getSwId() {
        return swId;
    }

    public void setSwId(String swId) {
        this.swId = swId == null ? null : swId.trim();
    }

    public String getSwVersion() {
        return swVersion;
    }

    public void setSwVersion(String swVersion) {
        this.swVersion = swVersion == null ? null : swVersion.trim();
    }

    public String getSwDescript() {
        return swDescript;
    }

    public void setSwDescript(String swDescript) {
        this.swDescript = swDescript == null ? null : swDescript.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getProtocalHeaderVersion() {
        return protocalHeaderVersion;
    }

    public void setProtocalHeaderVersion(String protocalHeaderVersion) {
        this.protocalHeaderVersion = protocalHeaderVersion == null ? null : protocalHeaderVersion.trim();
    }

    public String getProtocalVersion() {
        return protocalVersion;
    }

    public void setProtocalVersion(String protocalVersion) {
        this.protocalVersion = protocalVersion == null ? null : protocalVersion.trim();
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus == null ? null : recordStatus.trim();
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
        this.userId = userId == null ? null : userId.trim();
    }

    @Override
    public String toString() {
        return "DeviceSoftwareVersion [swId=" + swId + ", swVersion=" + swVersion + ", swDescript=" + swDescript + ", deviceType=" + deviceType + ", protocalHeaderVersion=" + protocalHeaderVersion + ", protocalVersion=" + protocalVersion + ", recordStatus=" + recordStatus + ", createTime=" + createTime + ", updateTime=" + updateTime + ", userId=" + userId + "]";
    }
}
