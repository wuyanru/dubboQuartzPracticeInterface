package com.fourthbutton.telematics.pds.entity;

import java.io.Serializable;
import java.util.Date;

public class BindingLog implements Serializable {
  private static final long serialVersionUID = 1586687265394218420L;

  private Long id;
  private String iccId;
  private String deviceSn;
  private String imei;
  private String vin;
  private Date createTime;
  private Date updateTime;
  private String recordStatus;
  private String updateUser;
  private Long bingdingType;



  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getIccId() {
    return iccId;
  }

  public void setIccId(String iccId) {
    this.iccId = iccId;
  }

  public String getDeviceSn() {
    return deviceSn;
  }

  public void setDeviceSn(String deviceSn) {
    this.deviceSn = deviceSn;
  }

  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
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

  public String getRecordStatus() {
    return recordStatus;
  }

  public void setRecordStatus(String recordStatus) {
    this.recordStatus = recordStatus;
  }

  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  public Long getBingdingType() {
    return bingdingType;
  }

  public void setBingdingType(Long bingdingType) {
    this.bingdingType = bingdingType;
  }



}
