package com.vz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainOld {

	public static void main(String[] args) {
ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		JdbcTemplate jt = (JdbcTemplate)ctx.getBean("jdbcTemplate");
//		
//		jt.update((Connection conn) -> {
//				PreparedStatement pst = conn.prepareStatement("insert into emp(empno, name, address, salary) values(?,?,?,?)");
//				pst.setInt(1, 105);
//				pst.setString(2, "Naresh");
//				pst.setString(3, "Vizag");
//				pst.setDouble(4, 75000);
//				return pst;
//		});
//		
//		List<Employee> empList= jt.query((Connection conn) -> {
//				PreparedStatement pst = conn.prepareStatement("select * from emp");
//				return pst;
//		}, (ResultSet rs, int index) -> {
//				return new Employee(rs.getInt("empno"), rs.getString("name"), rs.getString("address"), rs.getDouble("salary"));
//			}
//		);
		
		
//		List<Employee> empList = jt.query("select * from emp", new RowMapper<Employee>(){
//
//			@Override
//			public Employee mapRow(ResultSet rs, int index) throws SQLException {
//				return new Employee(rs.getInt("empno"), rs.getString("name"), rs.getString("address"), rs.getDouble("salary"));
//			}
//			
//		});
		
//		for(Employee e:empList){
//			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getCity()+" "+e.getSalary());
//		}
//		
//		
//		
//		EmpService service = (EmpService) ctx.getBean("empService");
//		
		
//		System.out.println(service.registerEmployee(100, "test1", "city1", 50000));
//		System.out.println(service.registerEmployee(200, "test2", "city2", 50000));
//		System.out.println(service.registerEmployee(300, "test3", "city3", 50000));
//		System.out.println(service.registerEmployee(400, "test4", "city4", 50000));

	}

}
