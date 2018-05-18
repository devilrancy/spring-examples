package com.vz.spring;

public class EmpDaoJdbcImpl implements EmpDao{

	@Override
	public String saveEmp(Employee e) {
		System.out.println("Employee with id "+e.getEmpId()+" is saved");
		return "saved";
	}
	
}
