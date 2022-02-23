//advice
package com.mondee;

import org.springframework.aop.ThrowsAdvice;

public class LoggingAspect implements ThrowsAdvice{
	public void afterThrowing(Exception ex) {
		System.out.println("LoggingAspect applied if exception occurs,exe message=" + ex.getMessage());
		
	}

	
}
