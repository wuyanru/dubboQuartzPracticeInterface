package com.fourthbutton.telematics.pds.entity;

import java.io.Serializable;
import java.util.Date;

public class BussinessGroup implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3977744432829044311L;

	private Integer bussinessGroupId;

    private String groupName;

    private Integer gatewayId;

    private String appId;

    private String appKey;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private String thirdPartyEntrenceConfiguration;

    public Integer getBussinessGroupId() {
        return bussinessGroupId;
    }

    public void setBussinessGroupId(Integer bussinessGroupId) {
        this.bussinessGroupId = bussinessGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Integer gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
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

    public String getThirdPartyEntrenceConfiguration() {
        return thirdPartyEntrenceConfiguration;
    }

    public void setThirdPartyEntrenceConfiguration(String thirdPartyEntrenceConfiguration) {
        this.thirdPartyEntrenceConfiguration = thirdPartyEntrenceConfiguration == null ? null : thirdPartyEntrenceConfiguration.trim();
    }
}