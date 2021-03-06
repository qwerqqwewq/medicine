package com.zte.medicine.action;

import com.google.gson.Gson;
import com.zte.medicine.entity.Firm;
import com.zte.medicine.form.FirmForm;
import com.zte.medicine.service.FirmService;
import org.apache.struts.action.ActionForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:helloboy
 * Date:2020-02-28 12:53
 * Description:<描述>
 */
@Controller
@RequestMapping("/firm")
@SessionAttributes("firm")
public class FirmAction {
    @Autowired
    private FirmService firmService;

    /**
     * 添加供应商信息
     * @param form
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/add")
    public String addFirm(ActionForm form, HttpServletRequest request)throws Exception{

        Map map = new HashMap(50);
        Gson gson =new Gson();

        FirmForm firmForm = (FirmForm) form;
        Firm firm = new Firm();

        if (firmService.findFirmByName(firmForm.getFirmName())!=null) {
            firm.setCity(firmForm.getCity());
            firm.setFirmCode(firmForm.getFirmCode());
            firm.setFirmName(firmForm.getFirmName());
            firm.setLinkTel(firmForm.getLinkTel());
            firm.setLink(firmForm.getLink());

            try {
                firmService.addFirm(firm);
                map.put("msg", "添加成功");
            } catch (Exception e) {
                map.put("msg", "插入失败");
            }
        }else {
            map.put("msg", "供应商信息已存在");
        }
        return gson.toJson(map);
    }

    /**
     * 修改供应商信息
     * @param form
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/update")
    public String updateFirm(ActionForm form, HttpServletRequest request)throws Exception{
        Map map = new HashMap(50);
        Gson gson =new Gson();

        FirmForm firmForm = (FirmForm) form;
        Firm firm = new Firm();

        firm.setCity(firmForm.getCity());
        firm.setFirmCode(firmForm.getFirmCode());
        firm.setFirmName(firmForm.getFirmName());
        firm.setLinkTel(firmForm.getLinkTel());
        firm.setLink(firmForm.getLink());

        try {
            firmService.modifyFirm(firm);
            map.put("msg", "添加成功");
        } catch (Exception e) {
            map.put("msg", "插入失败");
        }

        return gson.toJson(map);
    }

    /**
     * 根据姓名显示供应商信息
     * @param form
     */
    @RequestMapping("/viewAll")
    public void viewByName(ActionForm form){
        FirmForm firmForm = (FirmForm)form;
        firmService.findFirmByName(firmForm.getFirmName());
    }
}
