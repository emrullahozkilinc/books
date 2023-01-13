package com.emr.webproject1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {

    private int counter;

    public void incrementCounter(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
