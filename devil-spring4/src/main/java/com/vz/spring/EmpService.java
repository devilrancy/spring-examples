package com.vz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	@Qualifier("empDaoJPAImpl")
	EmpDao dao;
	
//	public void setDao(EmpDao dao) {
//		this.dao = dao;
//	}

	public String registerEmployee(int id, String name, String city, double salary){
		String resp=dao.saveEmp(new Employee(id,name,city,salary));
		if(resp.equals("saved"))
			return "Emp Registered";
		return "Problem Occured";
	}
}
