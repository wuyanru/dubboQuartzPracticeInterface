package com.fourthbutton.telematics.pds.entity;

import java.io.Serializable;

public class MessagePolicy implements Serializable {

    private static final long serialVersionUID = 4815377958398099476L;

    private Integer policyId;

    private Integer pluginId;

    private String deviceType;

    private String serviceType;

    private String msgType;

    private String serviceLevelId;

    private String smsUrgencyLevel;

    private String linkType;

    private String channelName;

    private String channelType;

    private Integer timeoutTime;

    private String firstFallBackChannelType;

    private String secondFallBackChannelType;

    private String httpMessageHaveResponseContent;

    private String needAckReceipt;

    private String messageConsumers;

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getServiceLevelId() {
        return serviceLevelId;
    }

    public void setServiceLevelId(String serviceLevelId) {
        this.serviceLevelId = serviceLevelId == null ? null : serviceLevelId.trim();
    }

    public String getSmsUrgencyLevel() {
        return smsUrgencyLevel;
    }

    public void setSmsUrgencyLevel(String smsUrgencyLevel) {
        this.smsUrgencyLevel = smsUrgencyLevel == null ? null : smsUrgencyLevel.trim();
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType == null ? null : linkType.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public Integer getTimeoutTime() {
        return timeoutTime;
    }

    public void setTimeoutTime(Integer timeoutTime) {
        this.timeoutTime = timeoutTime;
    }

    public String getFirstFallBackChannelType() {
        return firstFallBackChannelType;
    }

    public void setFirstFallBackChannelType(String firstFallBackChannelType) {
        this.firstFallBackChannelType = firstFallBackChannelType == null ? null : firstFallBackChannelType.trim();
    }

    public String getSecondFallBackChannelType() {
        return secondFallBackChannelType;
    }

    public void setSecondFallBackChannelType(String secondFallBackChannelType) {
        this.secondFallBackChannelType = secondFallBackChannelType == null ? null : secondFallBackChannelType.trim();
    }

    public String getHttpMessageHaveResponseContent() {
        return httpMessageHaveResponseContent;
    }

    public void setHttpMessageHaveResponseContent(String httpMessageHaveResponseContent) {
        this.httpMessageHaveResponseContent = httpMessageHaveResponseContent == null ? null : httpMessageHaveResponseContent.trim();
    }

    public String getNeedAckReceipt() {
        return needAckReceipt;
    }

    public void setNeedAckReceipt(String needAckReceipt) {
        this.needAckReceipt = needAckReceipt == null ? null : needAckReceipt.trim();
    }

    public String getMessageConsumers() {
        return messageConsumers;
    }

    public void setMessageConsumers(String messageConsumers) {
        this.messageConsumers = messageConsumers == null ? null : messageConsumers.trim();
    }
}
