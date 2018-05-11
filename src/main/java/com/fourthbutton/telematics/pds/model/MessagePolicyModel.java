package com.fourthbutton.telematics.pds.model;

import java.io.Serializable;

public class MessagePolicyModel implements Serializable {
    private static final long serialVersionUID = 4879982042963579311L;
    private Integer pluginId;
    private String serviceType;
    private String msgType;

    /**
     * Default constructor
     */
    public MessagePolicyModel() {}

    /**
     * Simple constructor
     * 
     * @param serviceType
     * @param msgType
     */
    public MessagePolicyModel(Integer pluginId, String serviceType, String msgType) {
        this.pluginId = pluginId;
        this.serviceType = serviceType;
        this.msgType = msgType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MessagePolicyModel)) {
            return false;
        }
        MessagePolicyModel other = (MessagePolicyModel) obj;
        if (this == obj) {
            return true;
        }
        return serviceType.equals(other.serviceType) && msgType.equals(other.msgType) && pluginId.equals(other.pluginId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int code = serviceType.hashCode();
        code = code * 33 + msgType.hashCode();
        code = code * 33 + pluginId.hashCode();
        return code;
    }

}
