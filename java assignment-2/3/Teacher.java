package com.cg.ass.dto;
public class Teacher extends Person {

	private String[] courses;
	private  int numCourses;

	public Teacher(String name, String address) {
		super(name, address);
		numCourses=0;
		courses=new String[30];
		
	}

	@Override
	public String toString() {
		return "Teacher [getAddress()=" + getAddress() + ", getName()=" + getName() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

public boolean addCourse(String Course) {
	boolean status=false;
	for( int i=0;i<numCourses;i++)
	{
	       if(Course.equals(courses[i]))
	    	   status=true;
	   
		
	}
	if(status==false) {
		courses[numCourses]=Course;
		numCourses++;
		return true;

	}
	else
		return false;
}
	

}