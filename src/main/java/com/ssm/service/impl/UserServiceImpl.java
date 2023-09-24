package com.ssm.service.impl;

import com.ssm.dao.StudentDao;
import com.ssm.dao.UserDao;
import com.ssm.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao udao;
	private StudentDao sdao;
	@Override
	public boolean login(String id, String pwd) {
		System.out.println("登录中"+id+" "+pwd);
		return sdao.login(id, pwd);
	}
	public UserServiceImpl() {
	}

	public void setUdao(UserDao udao) {
		this.udao = udao;
	}

	public void setSdao(StudentDao sdao) {
		this.sdao = sdao;
	}



}
