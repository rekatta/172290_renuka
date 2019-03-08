package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.pojo.Customer;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring1.xml");
	    
	    Customer customer=(Customer)context.getBean("customer");
	    customer.display();
	    

	}

}
