package com.vz.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam("username") String username, @RequestParam("password") String password){
		ModelAndView mv = new ModelAndView();
		if(username.equals(password)){
			mv.setViewName("success");
			mv.addObject("name", username);
		}
		else{
			mv.setViewName("failure");
		}
		return mv;
	}
}
