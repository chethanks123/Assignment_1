package com.sample.JavaMicroTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.JavaMicroTest.Bean.Employee;


@Service
public class JavaMicroService implements IEmployeeService{

	@Override
	public List<Employee> findAll() {
		//creating an object of ArrayList  
		ArrayList<Employee> emp = new ArrayList<Employee>();  
		//adding emp to the List  
		emp.add(new Employee("S00993","Chethan KS","Cloud Associate-Development","Java","Niveus Solution"));  
		emp.add(new Employee("S00995","Abhishek","Cloud Associate-Testing","Manual","Niveus Solution"));  
  
		//returns a list of Employee  
		return emp;
		
	}

}

