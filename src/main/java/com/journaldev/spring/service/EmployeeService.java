package com.journaldev.spring.service;

import java.util.List;
import com.c2t.annotation.basic.Employee;

public interface EmployeeService {

	public Employee searchById(Long id);
	 public List<Employee> getDummyEmployee1();
	 public Employee deleteById(Long id);

}
