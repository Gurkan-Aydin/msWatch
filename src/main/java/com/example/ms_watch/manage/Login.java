package com.example.ms_watch.manage;


import com.example.ms_watch.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class Login {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(name = "/")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void addUser(@RequestParam("userName") String userName, @RequestParam("password") String password) {


    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String index(@ModelAttribute("userName") String userName,@ModelAttribute("password") String password){
        Object user = userRepo.getLogin(userName, password);
        if(((Collection) user).isEmpty()) return "login";
        else
            return  "index";
    }








}
