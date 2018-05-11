package com.fourthbutton.telematics.pds.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SimInfo implements Serializable {

  private static final long serialVersionUID = -1048376807890253339L;
  private String iccid;
  private String imsi;
  private String msisdn;
  private String packageType;
  private String simState;
  private String batch;
  private String area;
  @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
  private Date inputTime;

  private String vin;

  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }


  public String getImsi() {
    return imsi;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public String getSimState() {
    return simState;
  }

  public void setSimState(String simState) {
    this.simState = simState;
  }

  public String getBatch() {
    return batch;
  }

  public void setBatch(String batch) {
    this.batch = batch;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public Date getInputTime() {
    return inputTime;
  }

  public void setInputTime(Date inputTime) {
    this.inputTime = inputTime;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }


}
