package com.zte.medicine.dao.impl;

import com.zte.medicine.dao.CustomerDao;
import com.zte.medicine.entity.Customer;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author:helloboy
 * Date:2020-03-13 8:08
 * Description:<描述>
 */

@Transactional(rollbackFor = Exception.class)
@Repository("CustomerDao")
public class CustomerDaoImpl implements CustomerDao {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void insertCustomer(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
    }

    @Override
    public Customer selectCustomerByCode(String code) {
        return (Customer)sessionFactory.getCurrentSession().get(Customer.class,code);
    }

    @Override
    public Customer selectCustomerByName(String name) {
        return (Customer)sessionFactory.getCurrentSession().createSQLQuery("select * from t_customer where CustomerName="+name+";");
    }

    @Override
    public void updateCustomer(Customer customer) {
        sessionFactory.getCurrentSession().update(customer);
    }

    @Override
    public void deleteCustomerByCode(String code) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().createSQLQuery("select * from t_customer where CustomerCode="+code+";"));
    }
}
