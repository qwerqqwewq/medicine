package com.zte.medicine.action;

import com.google.gson.Gson;
import com.zte.medicine.entity.Medicine;
import com.zte.medicine.form.MedicineForm;
import com.zte.medicine.service.MedicineService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:helloboy
 * Date:2020-02-28 12:54
 * Description:<描述>
 */
@Controller("MedicineAction")
@SessionAttributes("Medicine")
public class MedicineAction {

    @Autowired
    private MedicineService medicineService;

    /**
     * 插入药品信息
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public String add(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
        Map map = new HashMap(50);
        Gson gson =new Gson();

        MedicineForm medicineForm = (MedicineForm)form;
        Medicine medicine = new Medicine();
        medicine.setMedicineCode(medicineForm.getMedicineCode());
        medicine.setMedicineName(medicineForm.getMedicineName());
        medicine.setListPrice(medicineForm.getListPrice());
        medicine.setPrice(medicineForm.getPrice());
        medicine.setStock(medicineForm.getStock());
        medicine.setFirstDate(medicineForm.getFirstDate());
        medicine.setUsefullDate(medicineForm.getUsefullDate());
        medicine.settFirmByFirmCode(medicineForm.gettFirmByFirmCode());
        medicine.settKindByKindCode(medicineForm.gettKindByKindCode());
        try {
            medicineService.addMedicine(medicine);
            map.put("msg", "添加成功");
        } catch (Exception e) {
            map.put("msg", "插入失败");
        }
        return gson.toJson(map);
    }

    /**
     * 修改药品信息
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public String updateMedicine(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
        Map map = new HashMap(50);
        Gson gson =new Gson();

        MedicineForm medicineForm = (MedicineForm)form;
        Medicine medicine = new Medicine();
        medicine.setMedicineCode(medicineForm.getMedicineCode());
        medicine.setMedicineName(medicineForm.getMedicineName());
        medicine.setListPrice(medicineForm.getListPrice());
        medicine.setPrice(medicineForm.getPrice());
        medicine.setStock(medicineForm.getStock());
        medicine.setFirstDate(medicineForm.getFirstDate());
        medicine.setUsefullDate(medicineForm.getUsefullDate());
        medicine.settFirmByFirmCode(medicineForm.gettFirmByFirmCode());
        medicine.settKindByKindCode(medicineForm.gettKindByKindCode());
        try {
            medicineService.modifyMedicine(medicine);
            map.put("msg", "修改成功");
        } catch (Exception e) {
            map.put("msg", "修改失败");
        }
        return gson.toJson(map);
    }

    /**
     * 删除药品信息
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public String deleteMedicine(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
        Map map = new HashMap(50);
        Gson gson =new Gson();

        MedicineForm medicineForm = (MedicineForm)form;
        Medicine medicine = new Medicine();
        medicine.setMedicineCode(medicineForm.getMedicineCode());
        medicine.setMedicineName(medicineForm.getMedicineName());
        medicine.setListPrice(medicineForm.getListPrice());
        medicine.setPrice(medicineForm.getPrice());
        medicine.setStock(medicineForm.getStock());
        medicine.setFirstDate(medicineForm.getFirstDate());
        medicine.setUsefullDate(medicineForm.getUsefullDate());
        medicine.settFirmByFirmCode(medicineForm.gettFirmByFirmCode());
        medicine.settKindByKindCode(medicineForm.gettKindByKindCode());
        try {
            medicineService.removeMedicine(medicine);
            map.put("msg", "修改成功");
        } catch (Exception e) {
            map.put("msg", "修改失败");
        }
        return gson.toJson(map);
    }


    /**
     * 初级查询（只能根据药品名称查询）
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward search(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map map = new HashMap(50);
        Gson gson =new Gson();
        MedicineForm medicineForm = (MedicineForm)form;
        Medicine medicine = new Medicine();
        if (medicineService.findMedicineByName(medicineForm.getMedicineName()) != null) {
            medicine = medicineService.findMedicineByName(medicineForm.getMedicineName());
            request.setAttribute("medicine",medicine);
            return mapping.findForward("success");
        } else {
            return mapping.findForward("fail");
        }

    }

    /**
     * 高级查询
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward advancedSearch(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String stock =  request.getParameter("stock2");
        MedicineForm medicineForm = (MedicineForm) form;
        Medicine medicine = new Medicine();
        if (medicineForm!=null) {
            medicine = medicineService.advancedSearch(medicineForm.getMedicineCode(), medicineForm.getMedicineName(), medicineForm.getKindCode(), medicineForm.getStock(), stock, medicineForm.getFirmCode(), medicineForm.getFirstDate(), medicineForm.getUsefullDate());
            request.setAttribute("medicine",medicine);
            return mapping.findForward("success");
        } else {
            return mapping.findForward("fail");
        }

    }

}
