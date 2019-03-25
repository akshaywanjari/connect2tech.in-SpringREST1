package com.journaldev.spring.controllerALL;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c2t.annotation.basic.Employee;
import com.c2t.annotation.basic.EmployeeVo;

//import com.journaldev.spring.model.Employee;

import com.sun.media.jfxmedia.logging.Logger;

//@Controller
public class EmployeeControllerALL {
	
	@Autowired
	SessionFactory sf;
	
	//SET DATA

	@RequestMapping(value="/rest/emp/SetJSON", method=RequestMethod.GET)
    public @ResponseBody Employee setDummyEmployee() {
		
		//set data
		
		Session session=sf.openSession();
		
		Employee emp=new Employee();
		session.beginTransaction();
		emp.setId(30l);
		emp.setBirthDate(new java.sql.Date(1995, 02, 12));
		emp.setFirstname("ankit");
		emp.setLastname("soni");
		emp.setCellphone("3000");
		session.save(emp);	
		session.getTransaction().commit();
		session.close();
		return emp;
		
			
	}
	
	//LIST IS IN JSON FORMAT
	@RequestMapping(value="/rest/emp/listJSON", method=RequestMethod.GET)
    public @ResponseBody List<Employee> getDummyEmployee1() {
		
		// get LIST
		
		Session session=sf.openSession();

		String s="select s from Employee s";
		List<Employee> emp1=session.createQuery(s).list();
		
		//for single object data
		//Employee emp1=(Employee)session.get(Employee.class,1l);
		
		session.close();
		return emp1;		
	}
	
	
	//search
	@RequestMapping(value="/rest/emp/search/{id}", method=RequestMethod.GET)
    public @ResponseBody Employee searchById(@PathVariable Long id) {
		
		
		Session session=sf.openSession();
		Employee emp=(Employee)session.get(Employee.class,id);		
		session.close();
		return emp;		
	}
	
	
	
	//delete
	@RequestMapping(value="/rest/emp/Delete/{id}", method=RequestMethod.GET)
    public @ResponseBody Employee deleteById(@PathVariable Long id) {
		
		
		Session session=sf.openSession();
		session.beginTransaction();
		Employee emp=(Employee)session.get(Employee.class,id);
		session.delete(emp);
		session.getTransaction().commit();
		
		session.close();
		return emp;		
	}
	

	
	//LIST IS IN XML FORMAT
	@RequestMapping(value="rest/emp/listXML", method=RequestMethod.GET)

	public @ResponseBody EmployeeVo getDummyEmployeeList()

	{
		Query q = sf.openSession().createQuery("from Employee");
		List <Employee> list = q.list();
	     EmployeeVo e1=new EmployeeVo();
	     e1.setEmployees(list);

		return e1;

	}	
	
}
