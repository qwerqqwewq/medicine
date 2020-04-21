package com.zte.medicine.form;

import com.zte.medicine.entity.Power;
import org.apache.struts.action.ActionForm;

/**
 * @Author:helloboy
 * Date:2020-04-21 14:31
 * Description:<描述>
 */
public class UserForm extends ActionForm {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String position;
    private Power PowerByPowerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Power getPowerByPowerId() {
        return PowerByPowerId;
    }

    public void setPowerByPowerId(Power powerByPowerId) {
        PowerByPowerId = powerByPowerId;
    }
}
