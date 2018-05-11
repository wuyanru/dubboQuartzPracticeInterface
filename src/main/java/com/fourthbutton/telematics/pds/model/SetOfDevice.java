package com.fourthbutton.telematics.pds.model;

import java.io.Serializable;
import java.util.List;

public class SetOfDevice implements Serializable {

    private static final long serialVersionUID = -1524372484065086703L;

    private List<DeviceInfo> deviceInfoList;

    public List<DeviceInfo> getDeviceInfoList() {
        return deviceInfoList;
    }

    public void setDeviceInfoList(List<DeviceInfo> deviceInfoList) {
        this.deviceInfoList = deviceInfoList;
    }

}
