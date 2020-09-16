package com.miaoshaproject.dao;

import com.miaoshaproject.dataObject.ItemStockDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface ItemStockDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Tue Sep 15 14:45:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Tue Sep 15 14:45:17 CST 2020
     */
    int insert(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Tue Sep 15 14:45:17 CST 2020
     */
    int insertSelective(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Tue Sep 15 14:45:17 CST 2020
     */
    ItemStockDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Tue Sep 15 14:45:17 CST 2020
     */
    int updateByPrimaryKeySelective(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbggenerated Tue Sep 15 14:45:17 CST 2020
     */
    int updateByPrimaryKey(ItemStockDO record);

    // 通过itemId获取ItemStockDO对象
    ItemStockDO selectByItemId(Integer itemId);

    // 减库存
    int decreaseStock(@Param("itemId") Integer itemId, @Param("amount") Integer amount);

}