package com.vz.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path="/v1")
public class EmpRestService {
	
	static Map<Integer, Employee> empDB = new HashMap<>();
	
	static {
		empDB.put(100, new Employee(100, "A", "Hyd", 50000));
		empDB.put(101, new Employee(101, "B", "Hyd", 50000));
		empDB.put(102, new Employee(102, "C", "Hyd", 50000));
		empDB.put(103, new Employee(103, "D", "Hyd", 50000));
		empDB.put(104, new Employee(104, "E", "Hyd", 50000));
		empDB.put(105, new Employee(105, "F", "Hyd", 50000));
		empDB.put(106, new Employee(106, "G", "Hyd", 50000));
		empDB.put(107, new Employee(107, "H", "Hyd", 50000));
	}
	
	
	@RequestMapping(path="/info", method=RequestMethod.GET)
	public String info() {
		return "This is EMP Rest Service";
	}
	
	@RequestMapping(path="/find", method=RequestMethod.GET, produces={org.springframework.http.MediaType.APPLICATION_XML_VALUE,
			org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> getById(@RequestParam("id") int empId){
		if(empDB.containsKey(empId)){
			Employee e=empDB.get(empId);
			return ResponseEntity.ok(e);
		}else{
			return ResponseEntity.ok("Employee not found..");
		}
	}
	
	@RequestMapping(path="/save", method=RequestMethod.POST, produces={org.springframework.http.MediaType.TEXT_PLAIN_VALUE}, consumes={org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> saveEmp(@RequestBody Employee e) {
		if(empDB.containsKey(e.getEmpId())){
			return ResponseEntity.ok("Employee Already Exists");
		}
		else{
			empDB.put(e.getEmpId(), e);
			return ResponseEntity.ok("Employee Saved");
		}
	}
}
