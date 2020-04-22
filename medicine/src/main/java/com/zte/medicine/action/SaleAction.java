package com.zte.medicine.action;

import com.google.gson.Gson;
import com.zte.medicine.entity.Sale;
import com.zte.medicine.entity.SaleComment;
import com.zte.medicine.form.SaleForm;
import com.zte.medicine.service.SaleCommentService;
import com.zte.medicine.service.SaleService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:helloboy
 * Date:2020-02-28 12:54
 * Description:<描述>
 */
public class SaleAction {
    @Autowired
    private SaleService saleService;
    @Autowired
    private SaleCommentService saleCommentService;

    /**
     * 打开销售界面后显示所有的销售记录
     * @param request
     */
    public void viewAll(HttpServletRequest request) {
        request.setAttribute("sale",saleService.findAll());
    }

    /**
     * 插入销售信息
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

        Sale sale = new Sale();
        SaleComment saleComment = new SaleComment();
        sale.setAmount(Double.parseDouble(request.getParameter("Amount")));
        sale.setCustomerCode(request.getParameter("CustomerCode"));
        sale.setSaleDate(Timestamp.valueOf(request.getParameter("SaleDate")));
        sale.setSaleNum(Integer.parseInt(request.getParameter("SaleNum")));
        sale.setUserId(Integer.parseInt(request.getParameter("UserId")));
        saleComment.setAmount(Double.parseDouble(request.getParameter("Amount2")));
        saleComment.setMedicineCode(request.getParameter("MedicineCode"));
        saleComment.setNumber(Integer.parseInt(request.getParameter("Number")));
        saleComment.setPrice(request.getParameter("Price"));

        try {
            saleService.addSale(sale);
            saleCommentService.addSaleComment(saleComment);
            map.put("msg", "添加成功");
        } catch (Exception e) {
            map.put("msg", "插入失败");
        }
        return gson.toJson(map);
    }




    /**
     * 条件查询
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ActionForward advancedSearch(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String amount2 =  request.getParameter("amount2");
        SaleForm saleForm = (SaleForm) form;
        Sale sale = new Sale();
        if (saleForm!=null) {
            sale = saleService.findSale(saleForm.getSaleNum(), saleForm.getUserId(),saleForm.getCustomerCode(),saleForm.getSaleDate(),sale.getAmount(),amount2);
            request.setAttribute("sale",sale);
            return mapping.findForward("success");
        } else {
            return mapping.findForward("fail");
        }

    }



}
