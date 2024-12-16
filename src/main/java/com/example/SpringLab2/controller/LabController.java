package com.example.SpringLab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LabController {

    @GetMapping("/variables")
    public String variables(Model model) {
        model.addAttribute("name", "Ahmed Ghaleb");
        model.addAttribute("age", 23);
        model.addAttribute("isStudent", true);
        return "variables";
    }

    @GetMapping("/selection")
    public String selection(Model model) {
        model.addAttribute("user", new User("Ahmed Ghaleb", "ahmed@botfather.store"));
        return "selection";
    }

    @GetMapping("/messages")
    public String messages(Model model) {
        model.addAttribute("name", "Ahmed");
        model.addAttribute("age", 23);
        return "messages";
    }

    @GetMapping("/links")
    public String links() {
        return "links";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    static class User {
        private String fullName;
        private String email;

        public User(String fullName, String email) {
            this.fullName = fullName;
            this.email = email;
        }

        public String getFullName() { return fullName; }
        public String getEmail() { return email; }
    }
}
