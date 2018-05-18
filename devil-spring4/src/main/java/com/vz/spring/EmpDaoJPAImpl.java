package com.vz.spring;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoJPAImpl implements EmpDao{

	@Override
	public String saveEmp(Employee e) {
		System.out.println("JPA:Employee with id "+e.getEmpId()+" is saved");
		return "saved";
	}
	
}
