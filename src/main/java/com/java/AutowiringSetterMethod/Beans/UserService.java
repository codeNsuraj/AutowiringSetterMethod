package com.java.AutowiringSetterMethod.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	IUserDao userDao;
	
	@Autowired
	@Qualifier("UserDaoImpl1")
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	public void getName(Integer id) {
		
		System.out.println(userDao.findNameById(id));
		
	}

}
