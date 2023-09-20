package com.winter.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
public class Card {

	// advice
	// @Before("execution(* com.winter.app.aop.Transfer.*())")
	@Around("execution(* com.winter.app.aop.Transfer.*())")
	public Object CardCheck(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("===================================");
		log.info("Card Check 타기");

		Object[] arg = joinPoint.getArgs();
		log.info("Args :{} ",arg);

		Object object = joinPoint.proceed();

		log.info("Card Check 내리기");
		log.info("===================================");

		return object;
	}
}
