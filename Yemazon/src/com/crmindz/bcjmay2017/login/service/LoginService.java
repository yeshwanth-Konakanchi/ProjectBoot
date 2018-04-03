package com.crmindz.bcjmay2017.login.service;

import com.crmindz.bcjmay2017.login.dao.LoginDao;
import com.crmindz.bcjmay2017.yemazon.entity.Login;

public class LoginService {
	
	public static boolean validateUser(Login login){
		Login login1= LoginDao.getLoginDetails(login);
		if (login1.getPassword().equals(login.getPassword())){
			return true;
		}
		else
			return false;
	}

}
