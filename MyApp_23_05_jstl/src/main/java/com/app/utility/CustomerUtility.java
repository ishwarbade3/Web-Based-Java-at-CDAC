package com.app.utility;

import java.util.ArrayList;
import java.util.List;

import com.app.bean.Customer;

public class CustomerUtility {
	public static List<Customer> getCustomer(){
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("Ashish", "Rathi", 21,true));
		list.add(new Customer("sai", "Ambekar", 17, false));
		list.add(new Customer("varun", "Kirtane", 15,true));
		list.add(new Customer("Sidd", "Borekar", 23,false));
		list.add(new Customer("Mayuri", "fakirpure", 30,true));
		
		return list;

	}

}
	