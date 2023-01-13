package com.emr.webproject1.controller;

import com.emr.webproject1.service.LoggedUserManagementService;
import com.emr.webproject1.service.LoginCountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public MainController(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String home(
            @RequestParam(required = false) String logout, Model model
    ){

        if (logout != null)
            loggedUserManagementService.setUsername(null);

        String username = loggedUserManagementService.getUsername();

        model.addAttribute("username",username);
        model.addAttribute("counter", loginCountService.getCounter());

        if (username == null)
            return "redirect:/home";

        return "main";
    }
}
