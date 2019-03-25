package com.journaldev.spring.dao;

import java.util.List;

import com.c2t.annotation.basic.Employee;

public interface EmployeeDao {
	
	public Employee searchById(Long id);
	 public List<Employee> getDummyEmployee1();
	 public Employee deleteById(Long id);

}
