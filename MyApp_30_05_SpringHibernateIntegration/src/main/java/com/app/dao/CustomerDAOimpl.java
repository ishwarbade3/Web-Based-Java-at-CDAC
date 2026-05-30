package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

@Repository
public class CustomerDAOimpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Customer> getCustomer() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer", Customer.class);
		List<Customer> list = query.list();

		return list;
	}

	public void saveCustomer(Customer theCustomer) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(theCustomer);

	}

	public Customer getCustomer(int theId) {
		Session session = sessionFactory.getCurrentSession();
		Customer std = session.get(Customer.class, theId);
		return std ;
	}

	public void deleteCust(int theId) {
		Session session = sessionFactory.getCurrentSession();
		Customer std = session.get(Customer.class, theId);
		if(std!=null) {
		session.remove(std);
		}
	}

}
