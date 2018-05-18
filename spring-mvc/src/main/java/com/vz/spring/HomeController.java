package com.vz.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(path="/demo", method=RequestMethod.GET)
	public String homeMvc() {
		return "home";
	}
}
