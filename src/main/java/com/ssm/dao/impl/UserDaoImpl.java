package com.ssm.dao.impl;

import com.ssm.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean login(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		if(loginName.equals("admin") && loginPwd.equals("123456")) {
			return true;
		}
		return false;
	}
    
	
}
