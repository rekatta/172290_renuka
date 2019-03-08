package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.pojo10.Customer1;



public class Test10 {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("spring10.xml");
	Customer1 customer=(Customer1)context.getBean("customer1");
	customer.display();
	}

}
