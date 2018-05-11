package com.fourthbutton.telematics.pds.service;

import com.fourthbutton.telematics.pds.entity.VhlProfile;

/**
 * @author yf
 * @date 2015年6月30日 上午9:12:13
 * @version V1.0
 */
public interface VhlProfileService {
  /**
   * 根据vin查询车辆信息
   * 
   * @param vin
   * @return
   */
  public VhlProfile findByVIN(String vin);

  /**
   * 新增车辆信息
   * 
   * @param vhlProfile
   * @return
   */
  public int insert(VhlProfile vhlProfile);

  /**
   * 根据vin号修改车辆信息
   */
  public int update(VhlProfile vhlProfile);
}
