package com.zte.medicine.dao;

import com.zte.medicine.entity.Medicine;

import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-02-28 10:47
 * Description:<描述>
 */
public interface MedicineDao {

    /**
     * 添加药品信息
     * @param medicine
     */
    public void insertMedicine(Medicine medicine);

    /**
     * 修改药品信息
     * @param medicine
     */
    public void updateMedicine(Medicine medicine);

    /**
     * 根据药品编码查询
     * @param code
     * @return
     */
    public Medicine selectMedicineByCode(String code);

    /**
     * 根据药品名称查询
     * @param name
     * @return
     */
    public Medicine selectMedicineByName(String name);

    /**
     * 根据药品种类代码查询
     * @param code
     * @return
     */
    public Medicine selectMedicineByKind(String code);

    /**
     * 根据供应商编码查询
     * @param code
     * @return
     */
    public Medicine selectMedicineByFirm(String code);

    /**
     * 根据生产日期查询
     * @param date
     * @return
     */
    public Medicine selectMedicineByDate(Timestamp date);

    /**
     * 查询过期药品
     * @param date
     * @return
     */
    public Medicine selectMedicineByUsefulDate(Timestamp date);

    /**
     * 删除药品
     * @param medicine
     */
    public void deleteMedicine(Medicine medicine);






}
