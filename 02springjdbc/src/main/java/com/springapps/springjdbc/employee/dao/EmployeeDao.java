package com.springapps.springjdbc.employee.dao;

import com.springapps.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	int create(Employee employee);
	
	// hint: update employee set firstname=?, lastname=? where id = ?"
	int update(Employee employee);
	
	// hint: delete from employee where id = ?
	int delete(Employee employee);

}
