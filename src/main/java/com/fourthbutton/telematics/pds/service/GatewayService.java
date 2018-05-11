package com.fourthbutton.telematics.pds.service;

import java.util.List;

import com.fourthbutton.telematics.pds.entity.VhlProfile;
import com.fourthbutton.telematics.pds.model.DeviceAndSIMInfo;
import com.fourthbutton.telematics.pds.model.DeviceItem;

public interface GatewayService {
  /**
   * 通过VIN查询设备列表信息
   * 
   * @param vin
   * @return
   */
  public List<DeviceAndSIMInfo> queryDeviceListByVINorSN(String vin, String sn);

  /**
   * 通过SN查询设备列表信息
   * 
   * @param hardwareSN
   * @return
   */
  public List<DeviceItem> queryDeviceListBySN(String hardwareSN);

  /**
   * 通过vin号查询车辆信息
   */
  public VhlProfile findByVIN(String vin);

  /**
   * 插入车辆信息
   */
  public int insertVhlProfile(VhlProfile vhlProfile);

}
