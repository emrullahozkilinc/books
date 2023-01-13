package com.emr.webproject1.processor;

import com.emr.webproject1.service.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedService;

    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedService) {
        this.loggedService = loggedService;
    }


    public boolean isLogin() {

        boolean loginResult = username.equals("admin") && password.equals("654512");

        if (loginResult){
            loggedService.setUsername(username);
        }
        return loginResult;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
