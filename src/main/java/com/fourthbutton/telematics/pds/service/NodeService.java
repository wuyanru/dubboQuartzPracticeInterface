package com.fourthbutton.telematics.pds.service;

import com.fourthbutton.telematics.pds.entity.Node;

public interface NodeService {
	
	public Node findNodeById(Integer id);

	public Node findNodeByIp(String ip);
	
}
