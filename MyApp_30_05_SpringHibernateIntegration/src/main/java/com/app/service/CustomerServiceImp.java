package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDAO;
import com.app.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Transactional
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer();
	}

	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);

	}

	@Transactional
	public Customer getCustomer(int theId) {

		return customerDAO.getCustomer(theId);
	}

	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCust(theId);
	}

}
