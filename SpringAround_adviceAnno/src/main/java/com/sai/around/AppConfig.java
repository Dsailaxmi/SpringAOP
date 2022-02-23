package com.sai.around;


import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Student getStudent()
	{
		return new Student();
	}
	
	@Bean
	public AroundAdvice_logic getAroundAdvice_logic()
	{
		return new AroundAdvice_logic();
	}
	
	@Bean
	public AnnotationAwareAspectJAutoProxyCreator getAnnotationAwareAspectJAutoProxyCreator()
	{
		return new AnnotationAwareAspectJAutoProxyCreator();
	}
}