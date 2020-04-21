package com.zte.medicine.form;

import org.apache.struts.action.ActionForm;

/**
 * @Author:helloboy
 * Date:2020-04-21 14:23
 * Description:<描述>
 */
public class FirmForm extends ActionForm {
    private String firmCode;
    private String firmName;
    private String link;
    private Integer linkTel;
    private String city;

    public String getFirmCode() {
        return firmCode;
    }

    public void setFirmCode(String firmCode) {
        this.firmCode = firmCode;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(Integer linkTel) {
        this.linkTel = linkTel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
