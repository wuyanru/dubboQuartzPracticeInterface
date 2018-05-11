package com.fourthbutton.telematics.pds.service;

import java.util.List;
import java.util.Map;

import com.fourthbutton.telematics.pds.entity.DeviceSet;
import com.fourthbutton.telematics.pds.model.SetOfDevice;

public interface DeviceSetService {

  public int insertDeviceSet(DeviceSet deviceSet);

  public int update(DeviceSet deviceSet);

  public List<SetOfDevice> getPagingListById(Map<String, Object> map);

  public Integer getPagingListCount(Map<String, Object> map);

}
