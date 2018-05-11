package com.fourthbutton.telematics.pds.service;

import java.util.List;

import com.fourthbutton.telematics.pds.entity.DeviceConfigItem;

public interface DeviceConfigItemService {

    public List<DeviceConfigItem> getDeviceConfigItemByPluginId(int pluginId);

    /**
     * 获取item_id
     * @param itemNo
     * @param pluginId
     * @return
     */
    public int getConfigItemId(String itemNo, int pluginId);
}
