package com.demo.spring;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyJpaRepo extends CrudRepository<Employee, Integer> {

	@Query("select o from Employee o where o.salary>40000")
	public List<Employee> getAllMoreThan40k();
}
