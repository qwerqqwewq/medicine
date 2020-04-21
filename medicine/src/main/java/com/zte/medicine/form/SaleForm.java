package com.zte.medicine.form;

import org.apache.struts.action.ActionForm;

import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-04-21 14:27
 * Description:<描述>
 */
public class SaleForm extends ActionForm {
    private Integer saleNum;
    private Integer userId;
    private String customerCode;
    private Timestamp saleDate;
    private Double amount;

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public Timestamp getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Timestamp saleDate) {
        this.saleDate = saleDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
