package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AppController {
    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/withdraw")
    public String getWithdrawPage() {
        return "withdraw";
    }

    @GetMapping("")
    public String getWelcomePage() {
        return "welcome";
    }
}
