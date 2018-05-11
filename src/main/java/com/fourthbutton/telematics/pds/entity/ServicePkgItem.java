package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

public class ServicePkgItem extends AbstractObject {

    /**
	 * 
	 */
    private static final long serialVersionUID = -8954625969888831669L;

    private String serviceId;

    private String servicePkgId;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private String serviceType;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getServicePkgId() {
        return servicePkgId;
    }

    public void setServicePkgId(String servicePkgId) {
        this.servicePkgId = servicePkgId == null ? null : servicePkgId.trim();
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }
}
