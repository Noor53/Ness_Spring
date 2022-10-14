package com.aop.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {// Aspect Implementation // logging implementations
	
		@Before("execution(* com.aop.demo.service.ShoppingCart.*(..))")  // pointcut = expression to call service or join point
		public void	beforeLogger(){ // aspect
			
			System.out.println("Before Logger executed...");
			
		}
	
		
		@After("execution(* com.aop.demo.service.ShoppingCart.addProduct(..))")  // pointcut = expression to call service or join point
		public void	afterLogger(){ // aspect
			
			System.out.println("After Logger executed...");
			
		}
		
		
		@Pointcut("execution(* com.aop.demo.service.ShoppingCart.bookingStatus())")
		public void afterReturningPointCut() {

		}

		@AfterReturning(pointcut = "afterReturningPointCut()", returning = "status")
		public void afterReturningLogger(String status) {

			System.out.println("After Returning Logger value is : " +status);

		}
		
		

}
