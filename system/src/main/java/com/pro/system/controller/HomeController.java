package com.pro.system.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/login")
    public String login(@RequestParam("type") String type) {
        if ("student".equals(type)) {
            return "redirect:/login/student";
        } else if ("lecturer".equals(type)) {
            return "redirect:/login/lecturer";
        } else if ("coordinator".equals(type)) {
            return "redirect:/login/coordinator";
        } else {
        
            return "redirect:/";
        }
    }

   
    @GetMapping("/login")
    public String login() {
        return "redirect:/";
    }

    @GetMapping("/login/student")
    public String studentLogin() {
        return "student-login";
    }

    @GetMapping("/login/lecturer")
    public String lecturerLogin() {
        return "lecturer-login";
    }

    @GetMapping("/login/coordinator")
    public String coordinatorLogin() {
        return "coordinator-login";
    }
}

