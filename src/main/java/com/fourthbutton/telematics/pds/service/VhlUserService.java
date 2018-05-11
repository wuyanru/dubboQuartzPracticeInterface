package com.fourthbutton.telematics.pds.service;

import com.fourthbutton.telematics.pds.entity.VhlUser;

/**
 * @author yf
 * @date 2015年6月30日 上午9:22:53
 * @version V1.0
 */
public interface VhlUserService {

    public VhlUser findByVIN(String vin);
}
