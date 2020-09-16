package com.miaoshaproject.dao;

import com.miaoshaproject.dataObject.ItemDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Tue Sep 15 14:48:38 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Tue Sep 15 14:48:38 CST 2020
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Tue Sep 15 14:48:38 CST 2020
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Tue Sep 15 14:48:38 CST 2020
     */
    ItemDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Tue Sep 15 14:48:38 CST 2020
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbggenerated Tue Sep 15 14:48:38 CST 2020
     */
    int updateByPrimaryKey(ItemDO record);

    // 商品列表页
    List<ItemDO> listItem();

    int increaseSales(@Param("id")Integer id, @Param("amount")Integer amount);
}