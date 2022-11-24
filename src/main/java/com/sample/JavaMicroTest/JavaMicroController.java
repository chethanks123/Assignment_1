package com.sample.JavaMicroTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.JavaMicroTest.Bean.Employee;

@RestController
public class JavaMicroController {

	@Autowired
	public IEmployeeService iemployeeservice;
	
	
	@GetMapping(value = "/Employee")  
	public List<Employee> getProduct()   
	{  
	//finds all the Employee  
	List<Employee> emps = iemployeeservice.findAll();  
	//returns the Employee list  
	return emps;  
	}  
}
