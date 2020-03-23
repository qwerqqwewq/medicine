package com.zte.medicine.service.impl;

import com.zte.medicine.dao.MedicineDao;
import com.zte.medicine.entity.Medicine;
import com.zte.medicine.service.MedicineService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-02-07 17:25
 * Description:<描述>
 */
@Service("MedicineService")
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class MedicineServiceImpl implements MedicineService {

    private MedicineDao medicineDao;

    @Override
    public void addMedicine(Medicine medicine) {
        medicineDao.insertMedicine(medicine);
    }

    @Override
    public void modifyMedicine(Medicine medicine) {
        medicineDao.updateMedicine(medicine);
    }

    @Override
    public Medicine findMedicineByCode(String code) {
        return medicineDao.selectMedicineByCode(code);
    }

    @Override
    public Medicine findMedicineByName(String name) {
        return medicineDao.selectMedicineByName(name);
    }

    @Override
    public Medicine findMedicineByKind(String code) {
        return medicineDao.selectMedicineByKind(code);
    }

    @Override
    public Medicine findMedicineByFirm(String code) {
        return medicineDao.selectMedicineByFirm(code);
    }

    @Override
    public Medicine findMedicineByDate(Timestamp date) {
        return medicineDao.selectMedicineByDate(date);
    }

    @Override
    public Medicine findMedicineByUsefulDate(Timestamp date) {
        return medicineDao.selectMedicineByUsefulDate(date);
    }

    @Override
    public void removeMedicine(Medicine medicine) {
        medicineDao.deleteMedicine(medicine);
    }
}
