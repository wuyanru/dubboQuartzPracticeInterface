package com.fourthbutton.telematics.pds.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fourthbutton.telematics.pds.entity.DeviceProfile;
import com.fourthbutton.telematics.pds.model.SetOfDevice;


public interface DeviceProfileService {

    int deleteByPrimaryKey(String deviceId);

    int insert(DeviceProfile record);

    int insertSelective(DeviceProfile record);

    DeviceProfile selectByPrimaryKey(String deviceId);

    DeviceProfile selectByTUIdTypeAndTuId(String type, String tuId);

    int updateByPrimaryKeySelective(DeviceProfile record, Map<String, Object> filterParamMap);

    int updateByPrimaryKey(DeviceProfile record);

    // 通过suid找到vin号码
    public String findVINBySuid(String suid);

    // 通过vin找到suid号码
    public String findSuidByVIN(String vin);

    /* 根据userId查询device表,根据用户表的ID与device表的owner_id相关联 */
    DeviceProfile findDeviceByUserId(String userId);


    List<DeviceProfile> findAll();/* add this to aa cache */

    // 查询在某段修改时间之内的数据

    List<DeviceProfile> findByUpdateTime(Date lastupdateTime);

    public DeviceProfile selectByVIN(String vin);

    List<DeviceProfile> findTheCacheData(Date lastupdateTime);

    public List<DeviceProfile> findByAny(DeviceProfile entity);

    public List<DeviceProfile> pagingList(Map<String, Object> map);


    public Integer insertDeviceInfo(SetOfDevice setOfDevice);

    public Integer findTotalNumber();

    public DeviceProfile getSuidBySn(String sn);
}
