package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Customer;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring8.xml");
	Customer customer=(Customer)context.getBean("customer");
	context.registerShutdownHook();
	customer.display();

	}

}
