package com.zte.medicine.service;

import com.zte.medicine.entity.Sale;

import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-02-07 17:15
 * Description:<描述>
 */
public interface SaleService {

    /**
     * 添加销售信息
     * @param sale
     * @return
     */
    public void addSale(Sale sale);

    /**
     * 根据销售编码查询销售信息
     * @param num
     * @return
     */
    public Sale findSaleByNum(Integer num);

    /**
     * 根据销售员编号查询销售信息
     * @param id
     * @return
     */
    public Sale findSaleById(Integer id);

    /**
     * 根据客户编码查询销售信息
     * @param code
     * @return
     */
    public Sale findSaleByCode(String code);

    /**
     * 根据销售日期查询销售信息
     * @param date
     * @return
     */
    public Sale findSaleByDate(Timestamp date);

    /**
     * 根据销售的总金额查询
     * @param amount
     * @return
     */
    public Sale findSaleByAmount(double amount);

    /**
     * 删除销售信息（仅管理员可）
     * @param sale
     * @return
     */
    public void modifySaleByNum(Sale sale);
}
