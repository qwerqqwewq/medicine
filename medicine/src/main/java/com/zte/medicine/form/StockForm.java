package com.zte.medicine.form;

import org.apache.struts.action.ActionForm;

import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-04-21 14:28
 * Description:<描述>
 */
public class StockForm extends ActionForm {
    private Integer stockNum;
    private Integer userId;
    private String workType;
    private Timestamp workDate;

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public Timestamp getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Timestamp workDate) {
        this.workDate = workDate;
    }
}
