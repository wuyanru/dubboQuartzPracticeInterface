package com.fourthbutton.telematics.pds.service;

import java.util.List;
import java.util.Map;

import com.fourthbutton.telematics.pds.entity.SimProfile;

public interface SimProfileService {

  public List<SimProfile> findByAny(SimProfile entity);

  public List<SimProfile> findByPageList(Map<String, Object> paramMap);

  public Integer findByPageCount(Map<String, Object> paramMap);

  public void updateByAny(SimProfile entity, Map<String, Object> filterParamMap);

  public int insert(SimProfile entity);
  
  public  void updateByPrimaryKeySelective(SimProfile entity, Map<String, Object> filterParamMap);
}
