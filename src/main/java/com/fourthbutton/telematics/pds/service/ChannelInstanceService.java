package com.fourthbutton.telematics.pds.service;

import java.util.List;
import com.fourthbutton.telematics.pds.entity.ChannelInstance;

public interface ChannelInstanceService {
	
	public ChannelInstance findInstancesById(Integer id); 
	
	public List<ChannelInstance> findInstancesByNodeId(Integer nodeId);
	
	

}
