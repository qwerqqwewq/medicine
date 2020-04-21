package com.zte.medicine.action;

import com.zte.medicine.service.SaleCommentService;
import com.zte.medicine.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:helloboy
 * Date:2020-02-28 12:54
 * Description:<描述>
 */
public class SaleAction {
    @Autowired
    private SaleService saleService;
    private SaleCommentService saleCommentService;

    /**
     * 打开销售界面后显示所有的销售记录
     * @param request
     */
    public void viewAll(HttpServletRequest request) {
        request.setAttribute("sale",saleService.findAll());
    }



}
