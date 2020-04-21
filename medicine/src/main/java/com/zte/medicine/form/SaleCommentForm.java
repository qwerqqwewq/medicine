package com.zte.medicine.form;

import com.zte.medicine.entity.Sale;
import org.apache.struts.action.ActionForm;

/**
 * @Author:helloboy
 * Date:2020-04-21 14:28
 * Description:<描述>
 */
public class SaleCommentForm extends ActionForm {
    private Integer id;
    private String medicineCode;
    private String price;
    private Integer number;
    private Double amount;
    private Sale tSaleBySaleNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicineCode() {
        return medicineCode;
    }

    public void setMedicineCode(String medicineCode) {
        this.medicineCode = medicineCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Sale gettSaleBySaleNum() {
        return tSaleBySaleNum;
    }

    public void settSaleBySaleNum(Sale tSaleBySaleNum) {
        this.tSaleBySaleNum = tSaleBySaleNum;
    }
}
