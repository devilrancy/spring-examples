package com.vz.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	EmpDao dao;
	
//	public void setDao(EmpDao dao) {
//		this.dao = dao;
//	}

	public String registerEmployee(int id, String name, String city, double salary){
		dao.insertEmp(new Employee(id,name,city,salary));
		return "Emp Registered";
	}
	
	public String removeEmployee(int id){
		dao.removeEmp(id);
		return "Emp Removed";
	}
	
	public String updateEmployee(int id, String name){
		dao.updateEmp(id, name);
		return "Emp Updated";
	}
	
	public String listEmployees(){
		List<Employee> empList= dao.queryEmp();
		for(Employee e:empList){
			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getCity()+" "+e.getSalary());
		}
		return "Emp Records Retrieved";
	}
	
	public String registerAllEmployees(List<Employee> empList){
		String resp = dao.saveAll(empList);
		if(resp == "saved all"){
			return "records saved";
		}
		else{
			return "records rollbacked";
		}
	}
}
