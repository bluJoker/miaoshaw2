package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

public interface OrderService {
    /*
    * @Params:userId(用户id), itemId(商品id), amount(购买数量)
    * */
    OrderModel createOrder(Integer userId, Integer itemId, Integer amount) throws BusinessException;


}
