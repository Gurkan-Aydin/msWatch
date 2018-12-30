package com.example.ms_watch.manage;


import com.example.ms_watch.repo.UserRepo;
import com.example.ms_watch.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;


    @GetMapping("/get")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/kupp")
    @ResponseBody
    public Collection<User> getById(@RequestParam("id") int id) {
        return userRepo.findAllActiveUsers(id);
    }
}