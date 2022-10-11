package com.java.AutowiringSetterMethod.Beans;

import org.springframework.stereotype.Repository;

@Repository("UserDaoImpl2")
public class UserDaoImpl2 implements IUserDao {

	@Override
	public String findNameById(Integer id) {
		return "UserDaoImpl2";
	}

}
