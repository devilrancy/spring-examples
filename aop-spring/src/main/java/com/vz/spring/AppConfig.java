package com.vz.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.vz.spring")
@EnableAspectJAutoProxy
public class AppConfig {
	
}
