package com.journaldev.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c2t.annotation.basic.Employee;
import com.journaldev.spring.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping(value="/rest/emp/search/{id}", method=RequestMethod.GET)
    public @ResponseBody Employee searchById(@PathVariable Long id) {
		Employee emp=service.searchById(id);
		System.out.println(emp);
		return emp;		
	}
	
	
	

}
