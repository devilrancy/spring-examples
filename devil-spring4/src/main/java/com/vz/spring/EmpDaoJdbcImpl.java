package com.vz.spring;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoJdbcImpl implements EmpDao{

	@Override
	public String saveEmp(Employee e) {
		System.out.println("Employee with id "+e.getEmpId()+" is saved");
		return "saved";
	}
	
}
