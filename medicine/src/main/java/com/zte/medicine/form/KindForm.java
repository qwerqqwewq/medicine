package com.zte.medicine.form;

import org.apache.struts.action.ActionForm;

/**
 * @Author:helloboy
 * Date:2020-04-21 14:20
 * Description:<描述>
 */
public class KindForm extends ActionForm {
    private String kindCode;
    private String kindRemark;

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getKindRemark() {
        return kindRemark;
    }

    public void setKindRemark(String kindRemark) {
        this.kindRemark = kindRemark;
    }
}
