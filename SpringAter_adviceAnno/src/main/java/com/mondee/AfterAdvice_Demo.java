package com.mondee;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class AfterAdvice_Demo {

	@Pointcut("excution(* Employee.*(..))")
	public void pc() {
		
	}// pointcut name

	@After("pc()")
	public void afterDemo(JoinPoint jp)
	{
		System.out.println("AfterAdvice method excuted");
	}

}