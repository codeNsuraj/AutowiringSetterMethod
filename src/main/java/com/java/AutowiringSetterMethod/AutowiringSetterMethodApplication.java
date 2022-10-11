package com.java.AutowiringSetterMethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.AutowiringSetterMethod.Beans.UserService;

@SpringBootApplication
public class AutowiringSetterMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AutowiringSetterMethodApplication.class, args);
		
		UserService userService = configurableApplicationContext.getBean(UserService.class);
		
		userService.getName(11);
		
	}

}
