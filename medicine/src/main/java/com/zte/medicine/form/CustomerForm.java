package com.zte.medicine.form;

import org.apache.struts.action.ActionForm;

/**
 * @Author:helloboy
 * Date:2020-04-21 14:19
 * Description:<描述>
 */
public class CustomerForm extends ActionForm {
    private String customerCode;
    private String customerName;
    private Integer customerTel;
    private String city;

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(Integer customerTel) {
        this.customerTel = customerTel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
