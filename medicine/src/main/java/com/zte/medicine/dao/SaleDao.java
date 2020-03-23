package com.zte.medicine.dao;

import com.zte.medicine.entity.Sale;

import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-02-28 10:48
 * Description:<描述>
 */
public interface SaleDao {

    /**
     * 添加销售信息
     * @param sale
     * @return
     */
    public void insertSale(Sale sale);

    /**
     * 根据销售编码查询销售信息
     * @param num
     * @return
     */
    public Sale selectSaleByNum(Integer num);

    /**
     * 根据销售员编号查询销售信息
     * @param id
     * @return
     */
    public Sale selectSaleById(Integer id);

    /**
     * 根据客户编码查询销售信息
     * @param code
     * @return
     */
    public Sale selectSaleByCode(String code);

    /**
     * 根据销售日期查询销售信息
     * @param date
     * @return
     */
    public Sale selectSaleByDate(Timestamp date);

    /**
     * 根据销售的总金额查询
     * @param amount
     * @return
     */
    public Sale selectSaleByAmount(double amount);

    /**
     * 删除销售信息（仅管理员可）
     * @param sale
     * @return
     */
    public void updateSaleByNum(Sale sale);
}
