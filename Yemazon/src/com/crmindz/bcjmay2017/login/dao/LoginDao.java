package com.crmindz.bcjmay2017.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.crmindz.bcjmay2017.registration.service.Util;
import com.crmindz.bcjmay2017.yemazon.entity.Login;

public class LoginDao {
	public static Login getLoginDetails(Login login){
		
		Login login1 = new Login();
		
		try{
			
			Connection con = Util.getConnection();
			PreparedStatement pStatement= con.prepareStatement("select password from Login where userId=? ");
			pStatement.setString(1,login.getUserId());
			ResultSet result = pStatement.executeQuery();
			
			while(result.next()){
				login1.setPassword(result.getString("password"));
			}
			
			
		}catch(Exception e2){
			e2.printStackTrace();
			System.out.println(e2);
			
		}
		
		return login1;
	}
}
