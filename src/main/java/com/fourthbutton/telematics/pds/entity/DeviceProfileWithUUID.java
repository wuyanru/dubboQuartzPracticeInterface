package com.fourthbutton.telematics.pds.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class DeviceProfileWithUUID implements Serializable {
    /**
	 * 
	 */
    private static final long serialVersionUID = 147664571848645870L;

    private UUID tuId;

    private String deviceType;

    private String swId;

    private String vin;

    private String productVersion;

    private String telecomProvider;

    private String imsi;

    private String imei;

    private String iccid;

    private String msisdn;

    private String ssid;

    private String wifiPin;

    private String destination;

    private String pin;

    private String tuStatus;

    private Date eolDate;

    private String telecomPkgId;

    private String enrollFlag;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private Integer updVer;

    public DeviceProfileWithUUID() {
        super();
    }

    public UUID getTuId() {
        return tuId;
    }

    public void setTuId(UUID tuId) {
        this.tuId = tuId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getSwId() {
        return swId;
    }

    public void setSwId(String swId) {
        this.swId = swId == null ? null : swId.trim();
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin == null ? null : pin.trim();
    }

    public String getTuStatus() {
        return tuStatus;
    }

    public void setTuStatus(String tuStatus) {
        this.tuStatus = tuStatus == null ? null : tuStatus.trim();
    }

    public Date getEolDate() {
        return eolDate;
    }

    public void setEolDate(Date eolDate) {
        this.eolDate = eolDate;
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

    public Integer getUpdVer() {
        return updVer;
    }

    public void setUpdVer(Integer updVer) {
        this.updVer = updVer;
    }
}
