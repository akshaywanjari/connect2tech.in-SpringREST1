package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


import com.c2t.annotation.basic.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	SessionFactory sf;
	
    public Employee searchById(Long id) {
		
		Session session=sf.openSession();
		Employee emp=(Employee)session.get(Employee.class,id);		
		session.close();
		return emp;		
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
