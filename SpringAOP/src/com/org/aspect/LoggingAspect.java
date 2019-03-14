package com.org.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

public class LoggingAspect {
	@Around("@annotation(com.org.myAnnotation.Loggable)")
    public void loggingAdvice(ProceedingJoinPoint joinpoint)
    {
		
			try {
				System.out.println("before");
				joinpoint.proceed();
				System.out.println("after");
			} catch (Throwable e) {
				
				e.printStackTrace();
			}
	
		
	
    }
}
