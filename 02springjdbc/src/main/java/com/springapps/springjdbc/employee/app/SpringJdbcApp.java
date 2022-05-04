package com.springapps.springjdbc.employee.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springapps.springjdbc.employee.dao.EmployeeDao;
import com.springapps.springjdbc.employee.dto.Employee;

public class SpringJdbcApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springjdbc/employee/config/config.xml");
		EmployeeDao employeedao = (EmployeeDao) context.getBean("employeedao");
		
//		createEmployee(employeedao);
		
//		updateEmployee(employeedao);
		
//		deleteEmployee(employeedao);
		
//		readEmployee(employeedao);
		
		readEmployees(employeedao);
		
	}

	private static void readEmployees(EmployeeDao employeedao) {
		List<Employee> emps = employeedao.read();
		System.out.println(emps);		
	}

	private static void readEmployee(EmployeeDao employeedao) {
		Employee emp = employeedao.read(3);
		System.out.println(emp);
	}

	private static void deleteEmployee(EmployeeDao employeedao) {
		Employee emp = new Employee();
		emp.setId(1);
		int result = employeedao.delete(emp);
		System.out.println("Number of records deleted are: " + result);
	}

	private static void updateEmployee(EmployeeDao employeedao) {
		Employee emp = new Employee();
		emp.setId(3);
		emp.setFirstName("Bob");
		emp.setLastName("Rider");
		int result = employeedao.update(emp);
		System.out.println("Number of records updated are: " + result);
		
	}

	private static void createEmployee(EmployeeDao employeedao) {
		Employee emp = new Employee();
		emp.setId(3);
		emp.setFirstName("Max");
		emp.setLastName("Rider");
		int result = employeedao.create(emp);
		System.out.println("Number of records inserted are: " + result);
	}
	
}
