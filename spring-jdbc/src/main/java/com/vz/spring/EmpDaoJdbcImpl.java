package com.vz.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmpDaoJdbcImpl implements EmpDao{
	
	@Autowired
	private JdbcTemplate jt;
	
	public Integer insertEmp(Employee e) {
		Integer id = jt.update((Connection conn) -> {
			PreparedStatement pst = conn.prepareStatement("insert into emp(empno, name, address, salary) values(?,?,?,?)");
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getEmpName());
			pst.setString(3, e.getCity());
			pst.setDouble(4, e.getSalary());
			return pst;
		});
		
		System.out.println("Record Inserted !!");
		return id;
	}

	public Integer updateEmp(Integer id, String name) {
		Integer id1 = jt.update((Connection conn) -> {
			PreparedStatement pst = conn.prepareStatement("update emp set name=? where empno=?");
			pst.setString(1, name);
			pst.setInt(2, id);
			return pst;
		});
		
		return id1;
	}

	
	public Integer removeEmp(Integer id) {
		Integer id2 = jt.update((Connection conn) -> {
			PreparedStatement pst = conn.prepareStatement("delete from emp where empno=?");
			pst.setInt(1, id);
			return pst;
		});
		System.out.println("Record Deleted !!");
		return id2;
	}

	public List<Employee> queryEmp() {
		List<Employee> empList= jt.query((Connection conn) -> {
			PreparedStatement pst = conn.prepareStatement("select * from emp");
			return pst;
		}, (ResultSet rs, int index) -> {
				return new Employee(rs.getInt("empno"), rs.getString("name"), rs.getString("address"), rs.getDouble("salary"));
			}
		);
		System.out.println("Record Retrieved !!");
		return empList;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String saveAll(List<Employee> empList) {
		for(Employee e:empList){
			this.insertEmp(e);
		}
		return "saved all";
	}
	
}
