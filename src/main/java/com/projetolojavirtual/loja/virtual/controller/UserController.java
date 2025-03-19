package com.projetolojavirtual.loja.virtual.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        userService.save(user);
        model.addAttribute("message", "Usuário registrado com sucesso!");
        return "login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}
