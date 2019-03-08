package com.spring.pojo;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements InitializingBean{
//	String StudentName;

	//public String getStudentName() {
	//	return StudentName;
	//}

	//public void setStudentName(String studentName) {
	//	StudentName = studentName;
	//}
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	


	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void getStudentInfo(){  
	   // System.out.println("Hello: "+StudentName);  
	    //System.out.println(this.StudentName);
		System.out.println("point A=(" + getPointA().getX()+ ","+ getPointA().getY() + ")");
		System.out.println("point A=(" + getPointB().getX()+ ","+ getPointB().getY() + ")");
		System.out.println("point A=(" + getPointC().getX()+ ","+ getPointC().getY() + ")");
		
	}




	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("intialization init method");
		
	} 
	

}
