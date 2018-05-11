package com.fourthbutton.telematics.pds.entity;

import java.io.Serializable;
import java.util.Date;

public class SimProfile implements Serializable {
  private static final long serialVersionUID = -8496450964669357301L;
  private String iccId;
  private String updVer;
  private String msisdn;
  private String imsi;
  private String simProfileId;
  private String simStatus;
  private Date activeDate;
  private String batchNum;
  private String remark;
  private String ip;
  private String recordStatus;
  private Date createTime;
  private Date updateTime;
  private String userId;
  private String oemId;
  private String deliveryArea;
  private String packageType;
  private String vin;
  private Date activationTime;

  public String getIccId() {
    return iccId;
  }

  public void setIccId(String iccId) {
    this.iccId = iccId;
  }

  public String getUpdVer() {
    return updVer;
  }

  public void setUpdVer(String updVer) {
    this.updVer = updVer;
  }

  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public String getImsi() {
    return imsi;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

  public String getSimProfileId() {
    return simProfileId;
  }

  public void setSimProfileId(String simProfileId) {
    this.simProfileId = simProfileId;
  }

  public String getSimStatus() {
    return simStatus;
  }

  public void setSimStatus(String simStatus) {
    this.simStatus = simStatus;
  }

  public Date getActiveDate() {
    return activeDate;
  }

  public void setActiveDate(Date activeDate) {
    this.activeDate = activeDate;
  }

  public String getBatchNum() {
    return batchNum;
  }

  public void setBatchNum(String batchNum) {
    this.batchNum = batchNum;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
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

  public String getOemId() {
    return oemId;
  }

  public void setOemId(String oemId) {
    this.oemId = oemId;
  }

  public String getDeliveryArea() {
    return deliveryArea;
  }

  public void setDeliveryArea(String deliveryArea) {
    this.deliveryArea = deliveryArea;
  }

  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Date getActivationTime() {
    return activationTime;
  }

  public void setActivationTime(Date activationTime) {
    this.activationTime = activationTime;
  }


}
