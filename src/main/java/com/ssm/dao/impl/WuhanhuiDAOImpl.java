package com.ssm.dao.impl;

import com.ssm.dao.WuhanhuiDAO;

public class WuhanhuiDAOImpl implements WuhanhuiDAO {

	
	
	public boolean login(String loginName, String loginPwd) {
		// TODO Auto-generated method stub
		if(loginName.equals("吴晗辉") && loginPwd.equals("2061100021")) {
			return true;
		}
		return false;
	}
}
