package com.fourthbutton.telematics.pds.service;

import com.fourthbutton.telematics.pds.entity.DeviceConfig;

public interface DeviceConfigService {

  /**
   * 查询设备信息
   * 
   * @param configItemId
   * @return
   */
  public String getConfigItemValueByConfigItemId(int configItemId);

  /**
   * 更新配置信息
   * 
   * @param dc
   * @return
   */
  public int updateConfigration(DeviceConfig dc);

  /**
   * 插入设备信息
   * 
   * @param dc
   * @return
   */
  public int insertConfigration(DeviceConfig dc);

  /**
   * 判断是否存在记录
   * 
   * @param suid
   * @return
   */
  public Integer checkConfigItemIsExist(int configItemId);


  /**
   * 查询设备配置信息
   * 
   * @param suid
   * @return
   */
  public DeviceConfig getConfigration(String suid);


}
