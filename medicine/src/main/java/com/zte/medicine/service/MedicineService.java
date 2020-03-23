package com.zte.medicine.service;

import com.zte.medicine.entity.Medicine;

import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-02-07 17:15
 * Description:<描述>
 */
public interface MedicineService {
    /**
     * 添加药品信息
     * @param medicine
     */
    public void addMedicine(Medicine medicine);

    /**
     * 修改药品信息
     * @param medicine
     */
    public void modifyMedicine(Medicine medicine);

    /**
     * 根据药品编码查询
     * @param code
     * @return
     */
    public Medicine findMedicineByCode(String code);

    /**
     * 根据药品名称查询
     * @param name
     * @return
     */
    public Medicine findMedicineByName(String name);

    /**
     * 根据药品种类代码查询
     * @param code
     * @return
     */
    public Medicine findMedicineByKind(String code);

    /**
     * 根据供应商编码查询
     * @param code
     * @return
     */
    public Medicine findMedicineByFirm(String code);

    /**
     * 根据生产日期查询
     * @param date
     * @return
     */
    public Medicine findMedicineByDate(Timestamp date);

    /**
     * 查询过期药品
     * @param date
     * @return
     */
    public Medicine findMedicineByUsefulDate(Timestamp date);

    /**
     * 删除药品
     * @param medicine
     */
    public void removeMedicine(Medicine medicine);

}
