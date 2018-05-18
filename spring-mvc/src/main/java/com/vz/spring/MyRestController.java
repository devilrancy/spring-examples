package com.vz.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@RequestMapping(path="/greet", method=RequestMethod.GET)
	public String greet() {
		return "Hello";
	}
}
