package org.cg.labbook2.lab1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 ex1= new Exercise1();
		ex1.run();
		
	}
	
	public void run() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(Config.class);
		context.refresh();
		
		
		Employee employee = context.getBean(Employee.class);
		System.out.println("Employee ID :"+employee.getEmployeeId()+"Employee Name : "+employee.getEmployeeName()+"Employee Salary :"+employee.getSalary()+"Employee BU :"+employee.getBusinessUnit()+"Employee Age :"+employee.getAge());
		context.close();
	}

}
