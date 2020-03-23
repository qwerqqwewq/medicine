package com.zte.medicine.dao.impl;

import com.zte.medicine.dao.MedicineDao;
import com.zte.medicine.entity.Medicine;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-03-13 9:12
 * Description:<描述>
 */
@Transactional(rollbackFor = Exception.class)
@Repository("MedicineDao")
public class MedicineDaoImpl implements MedicineDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void insertMedicine(Medicine medicine) {
        sessionFactory.getCurrentSession().save(medicine);
    }

    @Override
    public void updateMedicine(Medicine medicine) {
        sessionFactory.getCurrentSession().update(medicine);
    }

    @Override
    public Medicine selectMedicineByCode(String code) {
        return (Medicine)sessionFactory.getCurrentSession().get(Medicine.class,code);
    }

    @Override
    public Medicine selectMedicineByName(String name) {
        return (Medicine)sessionFactory.getCurrentSession().createSQLQuery("select * from t_medicine where MedicineName="+name+";");
    }

    @Override
    public Medicine selectMedicineByKind(String code) {
        return (Medicine)sessionFactory.getCurrentSession().createSQLQuery("select * from t_medicine where KindCode="+code+";");
    }

    @Override
    public Medicine selectMedicineByFirm(String code) {
        return (Medicine)sessionFactory.getCurrentSession().createSQLQuery("select * from t_medicine where FirmCode="+code+";");
    }

    @Override
    public Medicine selectMedicineByDate(Timestamp date) {
        return (Medicine)sessionFactory.getCurrentSession().createSQLQuery("select * from t_medicine where FirstDate="+date+";");
    }

    @Override
    public Medicine selectMedicineByUsefulDate(Timestamp date) {
        return (Medicine)sessionFactory.getCurrentSession().createSQLQuery("select * from t_medicine where UsefullDate="+date+";");
    }

    @Override
    public void deleteMedicine(Medicine medicine) {
        sessionFactory.getCurrentSession().delete(medicine);
    }
}
