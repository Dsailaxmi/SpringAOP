//service
package com.mondee;

public class EmployeeService {
	public String getEmployeeName(int age)
	{
		System.out.println("Get Employee Information");
		if(age != 18)
		{
			 throw new ArithmeticException("Not a valid age"); 
		}
		else 
		{
			 throw new ArithmeticException("valid age"); 

		}
	}
}
