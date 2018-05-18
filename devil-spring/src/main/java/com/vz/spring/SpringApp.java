package com.vz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Mail mail=(Mail)ctx.getBean("mail");
		
		System.out.println(mail.getMessage().getBody());
		System.out.println(mail.getMessage().getHeader());
	}

}
