package com.zte.medicine.dao.impl;

import com.zte.medicine.dao.SaleDao;
import com.zte.medicine.entity.Sale;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Timestamp;

/**
 * @Author:helloboy
 * Date:2020-03-13 9:18
 * Description:<描述>
 */
@Transactional(rollbackFor = Exception.class)
@Repository("SaleDao")
public class SaleDaoImpl implements SaleDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void insertSale(Sale sale) {
        sessionFactory.getCurrentSession().save(sale);
    }

    @Override
    public Sale selectSaleByNum(Integer num) {
        return (Sale)sessionFactory.getCurrentSession().get(Sale.class,num);
    }

    @Override
    public Sale selectSaleById(Integer id) {
        return (Sale)sessionFactory.getCurrentSession().createSQLQuery("select * from t_sale where UserId="+id+";");
    }

    @Override
    public Sale selectSaleByCode(String code) {
        return (Sale)sessionFactory.getCurrentSession().createSQLQuery("select * from t_sale where CustomerCode="+code+";");
    }

    @Override
    public Sale selectSaleByDate(Timestamp date) {
        return (Sale)sessionFactory.getCurrentSession().createSQLQuery("select * from t_sale where SaleDate="+date+";");
    }

    @Override
    public Sale selectSaleByAmount(double amount) {
        return (Sale)sessionFactory.getCurrentSession().createSQLQuery("select * from t_sale where Amount="+amount+";");
    }

    @Override
    public void updateSaleByNum(Sale sale) {
        sessionFactory.getCurrentSession().update(sale);
    }
}
