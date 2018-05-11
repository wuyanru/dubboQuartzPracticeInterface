package com.fourthbutton.telematics.pds.model;


public class DeviceConfiguration {

    private String itemNo;// 项目编号
    private int itemType;// 项目类型
    private String itemValue;// 项目值

    public String getItemNo() {
        return itemNo;
    }


    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public DeviceConfiguration() {
    }

    public DeviceConfiguration(String itemNo, int itemType, String itemValue) {
        super();
        this.itemNo = itemNo;
        this.itemType = itemType;
        this.itemValue = itemValue;
    }


}
