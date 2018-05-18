package com.vz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService service = (EmpService) ctx.getBean("empService");
		
		System.out.println(service.registerEmployee(100, "test1", "city1", 50000));
		System.out.println(service.registerEmployee(200, "test2", "city2", 50000));
		System.out.println(service.registerEmployee(300, "test3", "city3", 50000));
		System.out.println(service.registerEmployee(400, "test4", "city4", 50000));
	}

}
