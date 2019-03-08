package com.spring.client;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.spring.pojo.Student;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	//	BeanFactory bean=new XmlBeanFactory(new FileSystemResource("res/spring.xml"));
      //  Student s=(Student)bean.getBean("s1");
       // s.setStudentName("Renu");
        //s.getStudentInfo();
    AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    
    Student student=(Student)context.getBean("s1");
    student.getStudentInfo();
    context.registerShutdownHook();
        
	}

}
