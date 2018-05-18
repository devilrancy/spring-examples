package com.vz.spring;

import java.util.List;

public interface EmpDao {
	
	public Integer insertEmp(Employee e);
	
	public Integer updateEmp(Integer id, String name);
	 
	public Integer removeEmp(Integer id);
	
	public List<Employee> queryEmp();
	
	public String saveAll(List<Employee> empList);
}
