package com.fourthbutton.telematics.pds.service;

import java.util.List;

import com.fourthbutton.telematics.pds.entity.MessagePolicy;
import com.fourthbutton.telematics.pds.model.MessagePolicyModel;

/**
 * @author yf
 * @date 2015年6月29日 下午3:09:58
 * @version V1.0
 */
public interface MessagePolicyService {

    MessagePolicy selectByServiceTypeAndMsgType(MessagePolicyModel mpModel);

    List<MessagePolicy> findAll();
}
