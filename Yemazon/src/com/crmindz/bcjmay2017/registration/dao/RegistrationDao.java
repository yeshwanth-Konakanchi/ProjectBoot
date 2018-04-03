package com.crmindz.bcjmay2017.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.crmindz.bcjmay2017.registration.service.Util;
import com.crmindz.bcjmay2017.yemazon.entity.Customer;
import com.crmindz.bcjmay2017.yemazon.entity.Login;

public class RegistrationDao {
	
	public static Customer saveCustomerDetails(Customer customer){
		int id=0;
		int id1=0;
		Customer customer1=new Customer();
		Login login1 = new Login();
		try{
			Connection con = Util.getConnection();
			String query1 = "insert into Customer (firstName,lastName,emailId,phoneNumber)"+ "values (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, customer.getFirstName());
			stmt.setString(2, customer.getLastName());
			stmt.setString(3, customer.getEmailId());
			stmt.setString(4, customer.getPhoneNumber());
			stmt.executeUpdate();
			
			ResultSet rset = stmt.getGeneratedKeys();
			
			if(rset.next()){
				id = rset.getInt(1);
			}
			
			String query2 = "insert into Login (userId,password,accountNo,Customer_cid)"+ "values (?,?,?,?)";
			PreparedStatement stmt2 = con.prepareStatement(query2, Statement.RETURN_GENERATED_KEYS);
			stmt2.setString(1, customer.getLogin().getUserId());
			stmt2.setString(2, customer.getLogin().getPassword());
			stmt2.setString(3, customer.getLogin().getAccountNo());
			stmt2.setInt(4, id);
			stmt2.executeUpdate();
			ResultSet rset1 = stmt.getGeneratedKeys();
			if(rset1.next()){
				id1 = rset.getInt(1);
			}
			
			PreparedStatement selectQuery = con.prepareStatement("select accountNo from Login where loginId=? ");
			selectQuery.setInt(1, id1);
			ResultSet rsetQuery = selectQuery.executeQuery();

			while (rsetQuery.next()) {
				login1.setAccountNo(rsetQuery.getString("accountNo"));
			}
	
			
		}
		catch(Exception e2){
			e2.printStackTrace();
			System.out.println(e2);
			
		}
		
		customer1.setLogin(login1);
		return customer1;
		
	}

}
