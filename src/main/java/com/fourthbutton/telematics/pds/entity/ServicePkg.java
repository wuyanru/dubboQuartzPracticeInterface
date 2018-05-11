package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

public class ServicePkg extends AbstractObject {
    /**
	 * 
	 */
    private static final long serialVersionUID = -1923998468881538129L;

    private String id;

    private String name;

    private String telecomPkgId;

    private String deviceId;

    private String deviceType;

    private String descript;

    private Date packBeginTime;

    private Date packEndTime;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelecomPkgId() {
        return telecomPkgId;
    }

    public void setTelecomPkgId(String telecomPkgId) {
        this.telecomPkgId = telecomPkgId == null ? null : telecomPkgId.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    public Date getPackBeginTime() {
        return packBeginTime;
    }

    public void setPackBeginTime(Date packBeginTime) {
        this.packBeginTime = packBeginTime;
    }

    public Date getPackEndTime() {
        return packEndTime;
    }

    public void setPackEndTime(Date packEndTime) {
        this.packEndTime = packEndTime;
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
}
