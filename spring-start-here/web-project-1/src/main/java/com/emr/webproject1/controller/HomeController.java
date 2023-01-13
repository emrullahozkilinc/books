package com.emr.webproject1.controller;

import com.emr.webproject1.processor.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final LoginProcessor loginProcessor;

    public HomeController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @RequestMapping("/home")
    public String getHome(){
        return "home";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ){
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);

        if (loginProcessor.isLogin()){
            return "redirect:/main";
        }

        model.addAttribute("message", "Login Failed");
        return "home";
    }
}
