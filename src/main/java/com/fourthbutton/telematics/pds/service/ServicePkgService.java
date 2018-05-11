package com.fourthbutton.telematics.pds.service;

import java.util.List;

import com.fourthbutton.telematics.pds.entity.ServicePkg;

/**
 * @author yangfan-pc 2015年7月22日下午1:49:24 version sprint3.0
 */
public interface ServicePkgService {

    public List<ServicePkg> findByVIN(String vin);
}
