package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

public class DeviceProfile extends AbstractObject {

  private static final long serialVersionUID = 1603848612711416212L;
  private String deviceId;
  private Integer channelId;
  private String ownerId;
  private String deviceType;
  private String tuIdType;
  private String swId;
  private String pdsn;
  private String vin;
  private String productVersion;
  private String telecomProvider;
  private String imsi;
  private String imei;
  private String iccid;
  private String msisdn;
  private String ssid;
  private String wifiPin;
  private String deviceStatus;
  private String pin;
  private String telecomPkgId;
  private String enrollFlag;
  private String destination;
  private Date eolDate;
  private String recordStatus;
  private Date createTime;
  private Date updateTime;
  private String userId;
  private String updVer;
  private String hardwareVersion;
  private String supplier;
  private String deviceSn;
  private String oemId;
  private String purchaseBatch;
  private String deliveryArea;
  private String deviceModel;
  private String deviceSetId;
  private Boolean hasPosition;
  private String remark;
  private String installPosition;

  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId == null ? null : deviceId.trim();
  }

  public Integer getChannelId() {
    return channelId;
  }

  public void setChannelId(Integer channelId) {
    this.channelId = channelId;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId == null ? null : ownerId.trim();
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType == null ? null : deviceType.trim();
  }

  public String getTuIdType() {
    return tuIdType;
  }

  public void setTuIdType(String tuIdType) {
    this.tuIdType = tuIdType == null ? null : tuIdType.trim();
  }

  public String getSwId() {
    return swId;
  }

  public void setSwId(String swId) {
    this.swId = swId == null ? null : swId.trim();
  }

  public String getPdsn() {
    return pdsn;
  }

  public void setPdsn(String pdsn) {
    this.pdsn = pdsn == null ? null : pdsn.trim();
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin == null ? null : vin.trim();
  }

  public String getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion == null ? null : productVersion.trim();
  }

  public String getTelecomProvider() {
    return telecomProvider;
  }

  public void setTelecomProvider(String telecomProvider) {
    this.telecomProvider = telecomProvider == null ? null : telecomProvider.trim();
  }

  public String getImsi() {
    return imsi;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi == null ? null : imsi.trim();
  }

  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei == null ? null : imei.trim();
  }

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid == null ? null : iccid.trim();
  }

  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn == null ? null : msisdn.trim();
  }

  public String getSsid() {
    return ssid;
  }

  public void setSsid(String ssid) {
    this.ssid = ssid == null ? null : ssid.trim();
  }

  public String getWifiPin() {
    return wifiPin;
  }

  public void setWifiPin(String wifiPin) {
    this.wifiPin = wifiPin == null ? null : wifiPin.trim();
  }

  public String getDeviceStatus() {
    return deviceStatus;
  }

  public void setDeviceStatus(String deviceStatus) {
    this.deviceStatus = deviceStatus == null ? null : deviceStatus.trim();
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin == null ? null : pin.trim();
  }

  public String getTelecomPkgId() {
    return telecomPkgId;
  }

  public void setTelecomPkgId(String telecomPkgId) {
    this.telecomPkgId = telecomPkgId == null ? null : telecomPkgId.trim();
  }

  public String getEnrollFlag() {
    return enrollFlag;
  }

  public void setEnrollFlag(String enrollFlag) {
    this.enrollFlag = enrollFlag == null ? null : enrollFlag.trim();
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination == null ? null : destination.trim();
  }

  public Date getEolDate() {
    return eolDate;
  }

  public void setEolDate(Date eolDate) {
    this.eolDate = eolDate;
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

  public String getUpdVer() {
    return updVer;
  }

  public void setUpdVer(String updVer) {
    this.updVer = updVer == null ? null : updVer.trim();
  }

  public String getHardwareVersion() {
    return hardwareVersion;
  }

  public void setHardwareVersion(String hardwareVersion) {
    this.hardwareVersion = hardwareVersion == null ? null : hardwareVersion.trim();
  }

  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier == null ? null : supplier.trim();
  }

  public String getDeviceSn() {
    return deviceSn;
  }

  public void setDeviceSn(String deviceSn) {
    this.deviceSn = deviceSn;
  }

  public String getOemId() {
    return oemId;
  }

  public void setOemId(String oemId) {
    this.oemId = oemId;
  }

  public String getPurchaseBatch() {
    return purchaseBatch;
  }

  public void setPurchaseBatch(String purchaseBatch) {
    this.purchaseBatch = purchaseBatch;
  }

  public String getDeliveryArea() {
    return deliveryArea;
  }

  public void setDeliveryArea(String deliveryArea) {
    this.deliveryArea = deliveryArea;
  }

  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public String getDeviceSetId() {
    return deviceSetId;
  }

  public void setDeviceSetId(String deviceSetId) {
    this.deviceSetId = deviceSetId;
  }

  public Boolean getHasPosition() {
    return hasPosition;
  }

  public void setHasPosition(Boolean hasPosition) {
    this.hasPosition = hasPosition;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getInstallPosition() {
    return installPosition;
  }

  public void setInstallPosition(String installPosition) {
    this.installPosition = installPosition;
  }

  @Override
  public String toString() {
    return "DeviceProfile [deviceId=" + deviceId + ", ownerId=" + ownerId + ", deviceType="
        + deviceType + ", tuIdType=" + tuIdType + ", swId=" + swId + ", pdsn=" + pdsn + ", vin="
        + vin + ", productVersion=" + productVersion + ", telecomProvider=" + telecomProvider
        + ", imsi=" + imsi + ", imei=" + imei + ", iccid=" + iccid + ", msisdn=" + msisdn
        + ", ssid=" + ssid + ", wifiPin=" + wifiPin + ", deviceStatus=" + deviceStatus + ", pin="
        + pin + ", telecomPkgId=" + telecomPkgId + ", enrollFlag=" + enrollFlag + ", destination="
        + destination + ", eolDate=" + eolDate + ", recordStatus=" + recordStatus + ", createTime="
        + createTime + ", updateTime=" + updateTime + ", userId=" + userId + ", updVer=" + updVer
        + ", hardwareVersion=" + hardwareVersion + ", supplier=" + supplier + ", deviceSn="
        + deviceSn + ", oemId=" + oemId + ", purchaseBatch=" + purchaseBatch + ", deliveryArea="
        + deliveryArea + ", deviceModel=" + deviceModel + ", deviceSetId=" + deviceSetId
        + ",hasPosition=" + hasPosition + "]";
  }

}
