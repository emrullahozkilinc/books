package com.emr.springstarthere.aspects.config;

import com.emr.springstarthere.aspects.aspect.AnnotationLoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.emr.springstarthere.aspects.service")
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public AnnotationLoggingAspect getLoggingAspect(){
        return new AnnotationLoggingAspect();
    }
}
