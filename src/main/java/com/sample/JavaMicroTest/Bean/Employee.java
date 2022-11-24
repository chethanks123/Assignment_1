package com.sample.JavaMicroTest.Bean;



public class Employee {

private String empid;
private String name;
private String designation;
private String techstack;
private String compapany;
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getTechstack() {
	return techstack;
}
public void setTechstack(String techstack) {
	this.techstack = techstack;
}
public String getCompapany() {
	return compapany;
}
public void setCompapany(String compapany) {
	this.compapany = compapany;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + ", techstack=" + techstack
			+ ", compapany=" + compapany + "]";
}
public Employee(String empid, String name, String designation, String techstack, String compapany) {
	super();
	this.empid = empid;
	this.name = name;
	this.designation = designation;
	this.techstack = techstack;
	this.compapany = compapany;
}
public Employee() {
	// TODO Auto-generated constructor stub
}



}
