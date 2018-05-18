package com.vz.spring;

import java.util.List;

public interface EmpDao {
	
	public String insertEmp(Employee e);
	
	public Integer updateEmp(Integer id, String name);
	 
	public String removeEmp(Integer id);
	
	public List<Employee> queryEmp();
	
	public String saveAll(List<Employee> empList);
	
	public Employee findById(int empid);
}
