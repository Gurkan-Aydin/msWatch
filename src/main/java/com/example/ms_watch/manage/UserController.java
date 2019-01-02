package com.example.ms_watch.manage;


import com.example.ms_watch.repo.UserRepo;
import com.example.ms_watch.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;


    @GetMapping("/get")
    public Object index() {
        return userRepo.findAll();
    }

    @RequestMapping(value = "/userById")
    @ResponseBody
    public User getById(@RequestParam("id") int id) {
        return userRepo.findUserById(id);
    }



}