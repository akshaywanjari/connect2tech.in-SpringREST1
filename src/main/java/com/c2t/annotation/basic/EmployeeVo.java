package com.c2t.annotation.basic;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class EmployeeVo implements Serializable {

	List<Employee> employees=new ArrayList<Employee>();



	public List<Employee> getEmployees() {

		return employees;

	}



	public void setEmployees(List<Employee> employees) {

		this.employees = employees;

	}



	

	



}

