package com.fourthbutton.telematics.pds.model;

import java.io.Serializable;

public class DeviceItem implements Serializable {
  private static final long serialVersionUID = -8515158234566919077L;
  private String hardwareSN;
  private String hardwareModel;
  private Boolean hasPosition;
  private String installPosition;

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

  public Boolean getHasPosition() {
    return hasPosition;
  }

  public void setHasPosition(Boolean hasPosition) {
    this.hasPosition = hasPosition;
  }

  public String getInstallPosition() {
    return installPosition;
  }

  public void setInstallPosition(String installPosition) {
    this.installPosition = installPosition;
  }

}
