package com.springapps.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcApp {

	public static void main(String[] args) {
		
		createEmployee();
		
	}

	private static void createEmployee() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springjdbc/config.xml");
		JdbcTemplate jdbctemplate = (JdbcTemplate) context.getBean("jdbctemplate");
		String sql = "insert into employee values (?, ?, ?)";
		int result = jdbctemplate.update(sql, 1, "John", "Wilson");
		System.out.println("Number of records inserted are: " + result);
	}
	
}
