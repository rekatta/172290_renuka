package com.org.test;

import com.org.service.FactoryService;
import com.org.service.ShapeServices;

public class test {
	public static void main(String args[])
	{
		FactoryService factoryservice=new FactoryService();
		ShapeServices shapeservice= (ShapeServices) factoryservice.getBean("shapeservice");
		shapeservice.getCircle();
	}

}
