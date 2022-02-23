package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		System.out.println("---------------------------------------");

		EmployeeService es = context.getBean("employeeServiceProxy",
				EmployeeService.class);
		
		es.getEmployeeName(10);
	}

}
