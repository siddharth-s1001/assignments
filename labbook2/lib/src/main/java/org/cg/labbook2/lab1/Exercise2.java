package org.cg.labbook2.lab1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exercise2 {

	public static void main(String[] args) {
		Exercise2 ex2= new Exercise2();
		ex2.run();
		
	}
	
	public void run() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(Config.class);
		context.refresh();
		
		
		Employee employee = context.getBean(Employee.class);
		System.out.println("Employee ID :"+employee.getEmployeeId()+"Employee Name : "+employee.getEmployeeName()+"Employee Salary :"+employee.getSalary()+"Employee BU :"+employee.getBusinessUnit()+"Employee Age :"+employee.getAge());
		SBUBean bU = employee.getBU();
		System.out.println("sbuCode :"+bU.getSbuId()+"sbuHead :"+bU.getSbuHead()+"sbuName :"+bU.getSbuName());
		context.close();
	}
		
	

}
