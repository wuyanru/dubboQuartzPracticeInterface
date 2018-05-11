package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

public class ServiceContract extends AbstractObject {
    /**
	 * 
	 */
    private static final long serialVersionUID = 69052039689955065L;

    private String contractId;

    private String contractCustomerName;

    private String deviceId;

    private String vhlUserId;

    private Date contractBeginTime;

    private Date contractEndTime;

    private String contractSupport;

    private String remark;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private String servicePkgId;

    private String servicePkgName;

    private String serviceLevelId;

    private String id;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getContractCustomerName() {
        return contractCustomerName;
    }

    public void setContractCustomerName(String contractCustomerName) {
        this.contractCustomerName = contractCustomerName == null ? null : contractCustomerName.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getVhlUserId() {
        return vhlUserId;
    }

    public void setVhlUserId(String vhlUserId) {
        this.vhlUserId = vhlUserId == null ? null : vhlUserId.trim();
    }

    public Date getContractBeginTime() {
        return contractBeginTime;
    }

    public void setContractBeginTime(Date contractBeginTime) {
        this.contractBeginTime = contractBeginTime;
    }

    public Date getContractEndTime() {
        return contractEndTime;
    }

    public void setContractEndTime(Date contractEndTime) {
        this.contractEndTime = contractEndTime;
    }

    public String getContractSupport() {
        return contractSupport;
    }

    public void setContractSupport(String contractSupport) {
        this.contractSupport = contractSupport == null ? null : contractSupport.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getServicePkgId() {
        return servicePkgId;
    }

    public void setServicePkgId(String servicePkgId) {
        this.servicePkgId = servicePkgId == null ? null : servicePkgId.trim();
    }

    public String getServicePkgName() {
        return servicePkgName;
    }

    public void setServicePkgName(String servicePkgName) {
        this.servicePkgName = servicePkgName == null ? null : servicePkgName.trim();
    }

    public String getServiceLevelId() {
        return serviceLevelId;
    }

    public void setServiceLevelId(String serviceLevelId) {
        this.serviceLevelId = serviceLevelId == null ? null : serviceLevelId.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Override
    public String toString() {
        return "ServiceContract [contractId=" + contractId + ", contractCustomerName=" + contractCustomerName + ", deviceId=" + deviceId + ", vhlUserId=" + vhlUserId + ", contractBeginTime=" + contractBeginTime + ", contractEndTime=" + contractEndTime + ", contractSupport=" + contractSupport + ", remark=" + remark + ", recordStatus=" + recordStatus + ", createTime=" + createTime + ", updateTime="
                + updateTime + ", userId=" + userId + ", servicePkgId=" + servicePkgId + ", servicePkgName=" + servicePkgName + ", serviceLevelId=" + serviceLevelId + ", id=" + id + "]";
    }

}
