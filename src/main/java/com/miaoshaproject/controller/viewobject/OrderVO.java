package com.miaoshaproject.controller.viewobject;

import java.math.BigDecimal;

public class OrderVO {

    // 交易号 2020091600012828，交易号中会有含义：20200916（日期）...
    private String id;

    // 购买的用户id
    private Integer userId;

    // 购买的商品id
    private Integer itemId;

    // 购买商品的单价
    private BigDecimal itemPrice;

    // 购买数量
    private Integer amount;

    // 订单总价
    private BigDecimal orderPrice;

}
