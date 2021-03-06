package com.fourthbutton.telematics.pds.entity;

import java.io.Serializable;
import java.util.Date;

public class ChannelInstance implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1586687265394398420L;

	private Integer channelInstanceId;

    private Integer channelId;

    private Integer nodeId;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private String configuration;

    public Integer getChannelInstanceId() {
        return channelInstanceId;
    }

    public void setChannelInstanceId(Integer channelInstanceId) {
        this.channelInstanceId = channelInstanceId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
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