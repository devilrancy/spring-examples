package com.vz.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
			
		EmpService service = (EmpService) ctx.getBean("empService");
		
//		System.out.println(service.registerEmployee(901, "test4", "city4", 50000));
		System.out.println(service.listEmployees());
		
//		List<Employee> allEmps = new ArrayList<Employee>();
//		allEmps.add(new Employee(908, "test4", "city4", 50000));
//		allEmps.add(new Employee(909, "test4", "city4", 50000));
//		allEmps.add(new Employee(910, "test4", "city4", 50000));
//		allEmps.add(new Employee(901, "test4", "city4", 50000));
//		allEmps.add(new Employee(902, "test4", "city4", 50000));
//		allEmps.add(new Employee(903, "test4", "city4", 50000));
//		System.out.println(service.registerAllEmployees(allEmps));
		
		
//		System.out.println(service.registerEmployee(901, "test4", "city4", 50000));
//		System.out.println(service.listEmployees());
//		System.out.println(service.updateEmployee(901, "Rakesh"));
//		System.out.println(service.listEmployees());
//		System.out.println(service.removeEmployee(901));
//		System.out.println(service.listEmployees());
		
	}
}
