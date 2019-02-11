package com.cg.app;

import com.cg.ass.dto.Person;
import com.cg.ass.dto.Student4;
import com.cg.ass.dto.Teacher;

public class Teacher_StudentApp {
	
	public static void main(String[] args) {
		Person p = new Person("renuka","vsp");
		Student4 s = new Student4("raja","hyd");
		Teacher t = new Teacher("sahithi","kkd");
		System.out.println(t.addCourse("java"));
		s.addCourseGrade("hindi",90);
		
		
	}


}
