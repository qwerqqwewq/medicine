package com.zte.medicine.form;

import com.zte.medicine.entity.Firm;
import com.zte.medicine.entity.Kind;
import org.apache.struts.action.ActionForm;

import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-04-21 14:25
 * Description:<描述>
 */
public class MedicineForm extends ActionForm {
    private String medicineCode;
    private String medicineName;
    private String listPrice;
    private String price;
    private Integer stock;
    private Timestamp firstDate;
    private Timestamp usefullDate;
    private String kindCode;
    private String FirmCode;
    private Kind tKindByKindCode;
    private Firm tFirmByFirmCode;

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getFirmCode() {
        return FirmCode;
    }

    public void setFirmCode(String firmCode) {
        FirmCode = firmCode;
    }

    public String getMedicineCode() {
        return medicineCode;
    }

    public void setMedicineCode(String medicineCode) {
        this.medicineCode = medicineCode;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Timestamp getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Timestamp firstDate) {
        this.firstDate = firstDate;
    }

    public Timestamp getUsefullDate() {
        return usefullDate;
    }

    public void setUsefullDate(Timestamp usefullDate) {
        this.usefullDate = usefullDate;
    }

    public Kind gettKindByKindCode() {
        return tKindByKindCode;
    }

    public void settKindByKindCode(Kind tKindByKindCode) {
        this.tKindByKindCode = tKindByKindCode;
    }

    public Firm gettFirmByFirmCode() {
        return tFirmByFirmCode;
    }

    public void settFirmByFirmCode(Firm tFirmByFirmCode) {
        this.tFirmByFirmCode = tFirmByFirmCode;
    }
}
