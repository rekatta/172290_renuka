package com.cg.ass.dto;
import java.util.Arrays;

public class Student4  extends Person{

	private int numCourses;
	private String[] courses;
	private int[] grades;
	public Student4(String name, String address) {
		super(name, address);
		this.numCourses=0;
		
		
	}
	@Override
	public String toString() {
		return "Student4 [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
				+ Arrays.toString(grades) + "]";
	}
	public void  addCourseGrade(String courses,int grades) {
		this.courses[numCourses]=courses;
		this.grades[numCourses]=grades;
		numCourses++;
	}
	public void printGrades() {
		System.out.println(name);
		for( int i=0;i<numCourses;i++)
			System.out.println(courses[i] +":"+ grades[i]);
			
		
	}
	public double getAverageGrade() {
		int sum=0;
		for(int i=0;i<numCourses;i++)
			sum+=grades[i];
		
		return sum/numCourses;
			
	}

}