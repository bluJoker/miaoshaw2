package com.miaoshaproject.miaosha.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miaoshaproject.miaosha.error.BusinessException;

public interface SmsService {
    boolean sendOtpCode(String telphone) throws BusinessException, JsonProcessingException;
}
