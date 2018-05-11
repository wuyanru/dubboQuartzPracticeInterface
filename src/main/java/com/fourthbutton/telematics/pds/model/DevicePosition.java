package com.fourthbutton.telematics.pds.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DevicePosition implements Serializable {

  private static final long serialVersionUID = 6724204561382156585L;
  private String hardwareSN;
  private String hardwareModel;
  private float latitude;
  private float longitude;
  @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
  private Date samplingTime;
  private String signalType;// 信号类型
  private int deviationRange;// 偏差范围


  public String getSignalType() {
    return signalType;
  }


  public void setSignalType(String signalType) {
    this.signalType = signalType;
  }


  public int getDeviationRange() {
    return deviationRange;
  }


  public void setDeviationRange(int deviationRange) {
    this.deviationRange = deviationRange;
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

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public Date getSamplingTime() {
    return samplingTime;
  }

  public void setSamplingTime(Date samplingTime) {
    this.samplingTime = samplingTime;
  }

}
