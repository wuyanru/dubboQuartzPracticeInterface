package com.fourthbutton.telematics.pds.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DeviceInfo implements Serializable {

  private static final long serialVersionUID = -5235710549285544664L;
  private String hardwareSN;
  private String hardwareModel;
  private String hardwareVersion;
  private String softwareVersion;
  private String area;
  private String supply;
  private String batch;
  @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
  private Date inputTime;
  private String deviceState;
  private Boolean hasPosition;
  private String vin;
  private String remark;
  private String deviceSetID;
  private String imei;
  private String installPosition;
  private String iccid;

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getDeviceSetID() {
    return deviceSetID;
  }


  public void setDeviceSetID(String deviceSetID) {
    this.deviceSetID = deviceSetID;
  }

  public String getHardwareSN() {
    return hardwareSN;
  }

  public void setHardwareSN(String hardwareSN) {
    this.hardwareSN = hardwareSN;
  }

  public String getHardwareModel() {
    return hardwareModel;
  }

  public void setHardwareModel(String hardwareModel) {
    this.hardwareModel = hardwareModel;
  }

  public String getHardwareVersion() {
    return hardwareVersion;
  }

  public void setHardwareVersion(String hardwareVersion) {
    this.hardwareVersion = hardwareVersion;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getSupply() {
    return supply;
  }

  public void setSupply(String supply) {
    this.supply = supply;
  }

  public String getBatch() {
    return batch;
  }

  public void setBatch(String batch) {
    this.batch = batch;
  }

  public Date getInputTime() {
    return inputTime;
  }

  public void setInputTime(Date inputTime) {
    this.inputTime = inputTime;
  }

  public String getDeviceState() {
    return deviceState;
  }

  public void setDeviceState(String deviceState) {
    this.deviceState = deviceState;
  }

  public Boolean getHasPosition() {
    return hasPosition;
  }

  public void setHasPosition(Boolean hasPosition) {
    this.hasPosition = hasPosition;
  }


  public String getVin() {
    return vin;
  }


  public void setVin(String vin) {
    this.vin = vin;
  }


  public String getImei() {
    return imei;
  }


  public void setImei(String imei) {
    this.imei = imei;
  }


  public String getInstallPosition() {
    return installPosition;
  }


  public void setInstallPosition(String installPosition) {
    this.installPosition = installPosition;
  }


  public String getIccid() {
    return iccid;
  }


  public void setIccid(String iccid) {
    this.iccid = iccid;
  }


}
