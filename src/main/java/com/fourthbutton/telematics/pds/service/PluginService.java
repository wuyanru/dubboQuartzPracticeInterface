package com.fourthbutton.telematics.pds.service;

import com.fourthbutton.telematics.pds.entity.Plugin;

public interface PluginService {
	
	public Plugin findPluginByNameAndVersion(String pluginName, String pluginVersion);
}
