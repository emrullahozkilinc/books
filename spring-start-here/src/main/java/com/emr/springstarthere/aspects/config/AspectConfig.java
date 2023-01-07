package com.emr.springstarthere.aspects.config;

import com.emr.springstarthere.aspects.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.emr.springstarthere.aspects.service")
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public LoggingAspect getLoggingAspect(){
        return new LoggingAspect();
    }
}
