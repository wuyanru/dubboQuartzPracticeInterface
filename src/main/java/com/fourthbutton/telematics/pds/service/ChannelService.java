package com.fourthbutton.telematics.pds.service;

import java.util.List;

import com.fourthbutton.telematics.pds.entity.Channel;


public interface ChannelService {

    public Channel findChannelById(Integer id);

    public Channel findChannelByVin(String vin);

    public Channel findChannelByInstanceId(String instanceId);

    public List<Channel> findAll();

    /**
     * 获取pluginId和bussinessGroupId
     * @param channelId
     * @return
     */
    public Channel getPluginIdByChannelId(int channelId);
}
