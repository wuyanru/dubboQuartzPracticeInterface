package com.fourthbutton.telematics.pds.service;

import java.util.UUID;

import com.fourthbutton.telematics.pds.entity.DeviceProfile;

public interface DeviceProfileWithUUID {

    int deleteByPrimaryKey(UUID tuId);

    int insert(DeviceProfile record);

    int insertSelective(DeviceProfile record);

    DeviceProfile selectByPrimaryKey(UUID tuId);

    int updateByPrimaryKeySelective(DeviceProfile record);

    int updateByPrimaryKey(DeviceProfile record);
}
