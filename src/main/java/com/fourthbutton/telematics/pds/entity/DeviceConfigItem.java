package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

public class DeviceConfigItem extends AbstractObject {

    private static final long serialVersionUID = -4786815519489010528L;

    private int configItemId;
    private int pluginId;
    private String itemExplain;// 配置项说明
    private int valueType;// 配置项值的类型枚举值 0：dword；1：byte；2：string
    private String valuePattern;// 配置项值的格式
    private String defaultValue;// 配置项默认值
    private String valueExplain;// 配置项取值说明
    private String unit;// 配置项单位
    private String itemNo;// 配置项编号
    private String itemName;// 配置项名称
    private int sort;// 配置项排列顺序
    private boolean recordStatus;
    private Date createTime;
    private Date updateTime;
    private String userId;

    public int getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(int configItemId) {
        this.configItemId = configItemId;
    }

    public int getPluginId() {
        return pluginId;
    }

    public void setPluginId(int pluginId) {
        this.pluginId = pluginId;
    }

    public String getItemExplain() {
        return itemExplain;
    }


    public void setItemExplain(String itemExplain) {
        this.itemExplain = itemExplain;
    }

    public int getValueType() {
        return valueType;
    }

    public void setValueType(int valueType) {
        this.valueType = valueType;
    }

    public String getValuePattern() {
        return valuePattern;
    }

    public void setValuePattern(String valuePattern) {
        this.valuePattern = valuePattern;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getValueExplain() {
        return valueExplain;
    }

    public void setValueExplain(String valueExplain) {
        this.valueExplain = valueExplain;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public boolean isRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(boolean recordStatus) {
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
