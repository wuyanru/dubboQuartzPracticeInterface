package com.fourthbutton.telematics.pds.model;

import java.io.Serializable;

public class DeviceAndSIMInfo implements Serializable {

    private static final long serialVersionUID = 5004415607539189170L;
    private DeviceInfo deviceInfo;
    private SimInfo simInfo;

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public SimInfo getSimInfo() {
        return simInfo;
    }

    public void setSimInfo(SimInfo simInfo) {
        this.simInfo = simInfo;
    }

}
