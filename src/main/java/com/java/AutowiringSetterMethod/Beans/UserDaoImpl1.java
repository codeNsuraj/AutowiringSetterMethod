package com.java.AutowiringSetterMethod.Beans;

import org.springframework.stereotype.Repository;

@Repository("UserDaoImpl1")
public class UserDaoImpl1 implements IUserDao{

	@Override
	public String findNameById(Integer id) {
		return "UserDaoImpl1";
	}

}
