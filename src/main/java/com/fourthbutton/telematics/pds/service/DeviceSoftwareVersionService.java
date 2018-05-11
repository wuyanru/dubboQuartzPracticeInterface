package com.fourthbutton.telematics.pds.service;

import com.fourthbutton.telematics.pds.entity.DeviceSoftwareVersion;

/**
 * @author yf
 * @date 2015年6月29日 下午2:20:12
 * @version V1.0
 */
public interface DeviceSoftwareVersionService {

    public DeviceSoftwareVersion findByDeviceId(String deviceId);
}
