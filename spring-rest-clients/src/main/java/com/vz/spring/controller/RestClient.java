package com.vz.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path="/v1")
public class RestClient {

	@Autowired
	RestTemplate rt;
	
	@RequestMapping(path="/send", method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity send(@RequestParam("id") int id, 
			@RequestParam("name") String name, 
			@RequestParam("city") String city, 
			@RequestParam("salary") double salary) {
		
		Employee e = new Employee(id,name,city,salary);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity he =  new HttpEntity<>(e,headers);
		
		ResponseEntity<String> resp = rt.exchange(
				"http://localhost:8181/api/v1/save", 
				HttpMethod.POST, 
				he, 
				String.class);
		System.out.println("Request Body :"+resp.getBody());
		return resp;
	}
}
