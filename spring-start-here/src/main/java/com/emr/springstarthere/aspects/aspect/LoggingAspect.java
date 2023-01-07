package com.emr.springstarthere.aspects.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.emr.springstarthere.aspects.service.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.err.println("aspect before");
        joinPoint.proceed();
        System.err.println("aspect after");
    }
}
