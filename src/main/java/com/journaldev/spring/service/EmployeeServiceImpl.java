package com.journaldev.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c2t.annotation.basic.Employee;
import com.journaldev.spring.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee searchById(Long id) {
		// TODO Auto-generated method stub
		
		return dao.searchById(id);
	}

	@Override
	public List<Employee> getDummyEmployee1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
