package com.smartiot.smart.aops;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class SystemArchitecture {

	@Before("execution(* com.smartiot.smart.controllers.*.*(..))")
    public void doAccessCheck() {
        System.out.println("Hello");
    }
	
	@Before("execution(* com.smartiot.smart.aops.AppLogger.*(..))")
    public void doAccessCheckLog() {
        System.out.println("Hello-test");
    }
}
