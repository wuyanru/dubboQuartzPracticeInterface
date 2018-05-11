package com.fourthbutton.telematics.pds.entity;

import java.io.Serializable;
import java.util.Date;

public class Channel implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 986515540317774037L;

	private Integer channelId;

    private Integer bussinessGroupId;

    private Integer pluginId;

    private String port;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private String configuration;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getBussinessGroupId() {
        return bussinessGroupId;
    }

    public void setBussinessGroupId(Integer bussinessGroupId) {
        this.bussinessGroupId = bussinessGroupId;
    }

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
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

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration == null ? null : configuration.trim();
    }
}