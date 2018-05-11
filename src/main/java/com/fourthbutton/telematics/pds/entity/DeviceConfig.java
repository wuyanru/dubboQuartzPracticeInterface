package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

/**
 * 设备配置信息表
 * @author zph
 *
 */
public class DeviceConfig extends AbstractObject {

    private static final long serialVersionUID = -7264644767073831115L;

    private String deviceConfigId;// 关系ID

    private String suid;// 设备ID

    private int configItemId;// 外键，配置项ID

    private String configItemValue;// 配置项值

    private String recordStatus;// 记录状态 'Y, N'

    private Date createTime;// 创建时间

    private Date updateTime;// 最后更新时间

    private String userId;// 操作用户


    public String getDeviceConfigId() {
        return deviceConfigId;
    }


    public void setDeviceConfigId(String deviceConfigId) {
        this.deviceConfigId = deviceConfigId;
    }


    public String getSuid() {
        return suid;
    }


    public void setSuid(String suid) {
        this.suid = suid;
    }


    public int getConfigItemId() {
        return configItemId;
    }


    public void setConfigItemId(int configItemId) {
        this.configItemId = configItemId;
    }


    public String getConfigItemValue() {
        return configItemValue;
    }


    public void setConfigItemValue(String configItemValue) {
        this.configItemValue = configItemValue;
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


}
