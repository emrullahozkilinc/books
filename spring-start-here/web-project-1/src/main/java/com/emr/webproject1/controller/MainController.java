package com.emr.webproject1.controller;

import com.emr.webproject1.service.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/main")
    public String home(
            @RequestParam(required = false) String logout, Model model
    ){

        if (logout != null)
            loggedUserManagementService.setUsername(null);

        String username = loggedUserManagementService.getUsername();

        model.addAttribute("username",username);
        if (username == null)
            return "redirect:/home";

        return "main";
    }
}
