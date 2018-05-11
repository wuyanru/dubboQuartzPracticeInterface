package com.fourthbutton.telematics.pds.model;

import java.io.Serializable;
import java.util.List;

public class DeviceTrackingInfo implements Serializable {

    private static final long serialVersionUID = -7909138486108373198L;
    private DeviceItem deviceItem;
    private List<LocationInfo> locationInfoList;

    public DeviceItem getDeviceItem() {
        return deviceItem;
    }

    public void setDeviceItem(DeviceItem deviceItem) {
        this.deviceItem = deviceItem;
    }

    public List<LocationInfo> getLocationInfoList() {
        return locationInfoList;
    }

    public void setLocationInfoList(List<LocationInfo> locationInfoList) {
        this.locationInfoList = locationInfoList;
    }


}
