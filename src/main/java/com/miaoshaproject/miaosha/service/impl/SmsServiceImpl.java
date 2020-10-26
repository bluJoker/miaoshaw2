package com.miaoshaproject.miaosha.service.impl;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.miaoshaproject.miaosha.error.BusinessException;
import com.miaoshaproject.miaosha.error.EmBusinessError;
import com.miaoshaproject.miaosha.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.UUID;

@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public boolean sendOtpCode(String telphone) throws BusinessException, JsonProcessingException {

        // 连接阿里云
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",
                "LTAI4G5XByxyEaqWKqeq9gjp",
                "bUXiGW1KR3nTPJ9LUvK6uKhbbLoC25");
        IAcsClient client = new DefaultAcsClient(profile);

        // 构建请求
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");

        // 自定义参数（手机号，验证码，签名，模板）
        request.putQueryParameter("PhoneNumbers", telphone);
        request.putQueryParameter("SignName", "blumeng商城");
        request.putQueryParameter("TemplateCode", "SMS_205075824");

        // 构建一个短信的验证码
        HashMap<String, Object> map = new HashMap<>();
        String otpCode2 = UUID.randomUUID().toString().substring(0, 6 );

        System.out.println("telphone= " + telphone + " & smsOtpCode= " + otpCode2);

        httpServletRequest.getSession().setAttribute(telphone, otpCode2);

        map.put("code", otpCode2);
        request.putQueryParameter("TemplateParam", objectMapper.writeValueAsString(map));

        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            return response.getHttpResponse().isSuccess();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            // TODO: 没作用！
            throw new BusinessException(EmBusinessError.USER_OTP_SEND_FAIL);

        }

        return false;
    }
}
