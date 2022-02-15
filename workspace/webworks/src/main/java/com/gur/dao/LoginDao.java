package com.gur.dao;

import com.gur.beans.Login;

public class LoginDao {
	public boolean loginValidate(Login login) {
		return 
				login.getUserName().equals("sapient") && 
				login.getPassword().equals("india");
	}
}