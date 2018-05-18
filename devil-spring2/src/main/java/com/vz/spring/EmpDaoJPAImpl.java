package com.vz.spring;

public class EmpDaoJPAImpl implements EmpDao{

	@Override
	public String saveEmp(Employee e) {
		System.out.println("JPA:Employee with id "+e.getEmpId()+" is saved");
		return "saved";
	}
	
}
