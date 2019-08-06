package com.training.nosql.mongodb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.mongodb.morphia.annotations.Entity;

@Entity
public class Employee {
	//@Id
	private int empId;
	//@Indexed
	private String empName;
	private Date doj;
	private double salary;
	private List<String> skills=new ArrayList<>();
	private Address address;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, Date doj, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.doj = doj;
		this.salary = salary;
	}
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public void addSkill(String skill) {
		this.skills.add(skill);
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", doj=" + doj + ", salary=" + salary + ", skills="
				+ skills + ", address=" + address + "]";
	}
}

