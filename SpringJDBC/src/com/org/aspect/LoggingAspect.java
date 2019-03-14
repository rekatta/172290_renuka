package com.org.aspect;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

public class LoggingAspect{
	
	@Before("execution(*getAll())")
    public void loggingAdvice()
    {
		
		
			System.out.println("before inserting data");
		
		
	
    }
}
