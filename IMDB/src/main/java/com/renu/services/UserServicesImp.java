package com.renu.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renu.dao.UserDaoImp;

public class UserServicesImp {
	 ApplicationContext c=new ClassPathXmlApplicationContext("spring-web-config.xml");
	 UserDaoImp d=(UserDaoImp)c.getBean("edao");

}
