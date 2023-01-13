package com.emr.springstarthere.aspects.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AnnotationLoggingAspect {
    @AfterReturning(value = "@annotation(com.emr.springstarthere.aspects.annotation.ToLog)",
    returning = "returnedVal")
    public void log(Object returnedVal){
        System.err.println("Aspect worked");
        returnedVal = ((String)returnedVal) + "123";
    }
}
