package com.emr.springstarthere.aspects.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AnnotationLoggingAspect {
    @Around("@annotation(com.emr.springstarthere.aspects.annotation.ToLog)")
    public Object log(ProceedingJoinPoint pj){
        System.err.println("Aspect worked");
        return "";
    }
}
