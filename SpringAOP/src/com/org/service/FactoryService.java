package com.org.service;

import com.org.pojo.Circle;
import com.org.pojo.Traingle;

public class FactoryService {
	public Object getBean(String beanType)
	{
		if(beanType.equals("shapeservice"))return new ShapeServices();
		if(beanType.equals("circle"))return  new Circle();
		if(beanType.equals("traingle"))return new Traingle();
		
		return null;
	}


}
