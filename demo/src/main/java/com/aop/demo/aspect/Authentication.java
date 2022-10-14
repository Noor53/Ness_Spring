package com.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Authentication {
	
	
	@Pointcut("within(com..*)")
	public void authenticationPointCut() {

			// authen logics
	}

	@Pointcut("within(com..*)")
	public void authorizationPointCut() {
		
			// authroization logics
		
	}

	@Before("authenticationPointCut() &&  authorizationPointCut()")
	public void authenticate() {
		
		System.out.println("Authenticating the Request");
		
	}

}
