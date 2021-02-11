package com.example.banking.customer.controller;

import com.example.banking.customer.domain.User;
import com.example.banking.customer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/profile",method = RequestMethod.GET)
    public String profile(Model model, Principal principal){
        User user = userService.findByUsername(principal.getName());
        model.addAttribute("user",user);
        return "profile";
    }

    @RequestMapping(value = "profile", method = RequestMethod.POST)
    public String profilePost(@ModelAttribute("user") User newUser, Model model){
        User user = userService.findByUsername(newUser.getUsername());
        user.setUsername(newUser.getUsername());
        user.setEmail(newUser.getEmail());
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());
        user.setPhone(newUser.getPhone());

        model.addAttribute("user",user);
        userService.saveUser(user);
        return "profile";
    }

}
