package com.fourthbutton.telematics.pds.service;

import java.util.List;

import com.fourthbutton.telematics.pds.entity.BussinessGroup;

public interface BussinessGroupService {

    public BussinessGroup findBussinessGroupById(Integer id);

    public BussinessGroup findBussinessGroupByAppId(String appId);

    public BussinessGroup findBussinessGroupByVin(String vin);

    public List<BussinessGroup> findAll();

}
