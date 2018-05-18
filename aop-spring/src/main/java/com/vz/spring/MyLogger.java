package com.vz.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogger {
	
	@Before("execution(String com.vz.spring.EmpService.registerEmployee(..))")
	public void logBefore(){
		System.out.println("Logging Before method call");
	}
	
	@AfterReturning(pointcut="execution(* com.vz.spring.EmpService.registerEmployee(..))")
	public void logAfter(){
		System.out.println("Logging After method call");
	}

}
