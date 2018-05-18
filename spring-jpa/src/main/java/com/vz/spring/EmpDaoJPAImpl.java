package com.vz.spring;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmpDaoJPAImpl implements EmpDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public String insertEmp(Employee e) {
		em.persist(e);
		return "saved";
	}

	@Override
	public Integer updateEmp(Integer id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeEmp(Integer id) {
		Employee e = em.find(Employee.class, id);
		if(e!=null) { 
			em.remove(e);
			return "emp deleted";
		}
		else{
			return "emp deleted";
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> queryEmp() {
		Query query = em.createQuery("select e from Employee e");
		List<Employee> emps = query.getResultList();
		return emps;
	}

	@Override
	public String saveAll(List<Employee> empList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(int empid) {
		Employee e = em.find(Employee.class, empid);
		return e;
	}
	
}
