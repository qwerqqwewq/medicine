package com.zte.medicine.action;

import com.google.gson.Gson;
import com.zte.medicine.entity.Kind;
import com.zte.medicine.form.KindForm;
import com.zte.medicine.service.KindService;
import com.zte.medicine.service.impl.KindServiceImpl;
import org.apache.struts.action.ActionForm;
import org.apache.struts2.dispatcher.mapper.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:helloboy
 * Date:2020-02-28 12:55
 * Description:<描述>
 */
public class KindAction {

    public String add(ActionMapping mapping, ActionForm form,
                             HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Map map = new HashMap(50);
        Gson gson =new Gson();
        //获取类别信息
        KindForm kindForm = (KindForm)form;

        //创建类别对象
        Kind k = new Kind();
        try {
            k.setKindCode(kindForm.getKindCode());
            k.setKindRemark(kindForm.getKindRemark());
            KindService kindService = new KindServiceImpl();
            kindService.addKind(k);
            map.put("msg","添加成功");
        }catch (Exception e){
            map.put("msg", "添加失败");
        }

        return gson.toJson(map);
    }
}
