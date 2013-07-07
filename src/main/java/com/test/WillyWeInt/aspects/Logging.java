package com.test.WillyWeInt.aspects;

import org.aspectj.lang.JoinPoint;

public class Logging {
	
	public void beforeAdvice(JoinPoint joinPoint){
	System.out.println("Before Method - "+joinPoint.getSignature().getName());
	}
	public void afterAdvice(JoinPoint joinPoint){
	System.out.println("After Method - "+joinPoint.getSignature().getName());
	}
	public void AfterThrowingAdvice(IllegalArgumentException ex){
	System.out.println("There has been an exception: " +
	ex.toString());
	}

}
