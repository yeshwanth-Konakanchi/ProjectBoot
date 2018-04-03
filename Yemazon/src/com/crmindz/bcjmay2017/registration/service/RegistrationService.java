package com.crmindz.bcjmay2017.registration.service;

import com.crmindz.bcjmay2017.registration.dao.RegistrationDao;
import com.crmindz.bcjmay2017.yemazon.entity.Customer;
import com.crmindz.bcjmay2017.yemazon.entity.Login;

public class RegistrationService {
	
	public static String RandomNumber(long number){
		long n = (long) (Math.random()*number);
		return Long.toString(n);
	}
	
	public static Customer registerCustomer(Customer customer, Login login){
			
		login.setAccountNo(RandomNumber(2000000));
		customer.setLogin(login);
		Customer customer1 = RegistrationDao.saveCustomerDetails(customer);
		return customer1;
		}
		
	
}
