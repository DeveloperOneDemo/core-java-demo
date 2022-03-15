package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.Address;
import com.beans.User;

@Configuration
@ComponentScan("com.beans")
public class AppConfig {

	// commented everything here in order to work with annotation based configuration
	
//	@Bean(name = "sendUser")
//	public User sendUser(){
//		//constructor injection
////		User user = new User(456, "Gwen", sendAddress());
////		return user;
//		
//		//setter injection
//		User user = new User();
//		user.setUserId(456);
//		user.setUserName("Gwen");
//		user.setAddress(sendAddress());
//		return user;
//	}
//	
//	@Bean
//	public Address sendAddress() {
//		//constructor injection
//		//return new Address("CVB", 7890);
//		
//		//setter injection
//		Address add = new Address();
//		add.setStreet1("CVB");
//		add.setZipcode(7890);
//		return add;
//	}
}
