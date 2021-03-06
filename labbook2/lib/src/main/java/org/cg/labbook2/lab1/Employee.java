package org.cg.labbook2.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${emp.Id}")
	private int employeeId;
	
	@Value("${emp.Name}")
	private String employeeName;
	
	@Value("${salary}")
	private double salary;
	
	@Value("${B.U}")
	private String businessUnit;
	
	@Value("${age}")
	private int age;

	@Autowired
	private SBUBean bU;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age) {
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
		this.setSalary(salary);
		this.setBusinessUnit(businessUnit);
		this.setAge(age);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public int getAge() {
		return age;
	}

	public SBUBean getBU() {
		return bU;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBU(SBUBean bU) {
		this.bU = bU;
	}

	@Override
	public int hashCode() {
		return employeeId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}

}
