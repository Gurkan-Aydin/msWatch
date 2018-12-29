package com.example.ms_watch.manage;


import com.example.ms_watch.repo.UserRepo;
import com.example.ms_watch.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping({"/"})
public class UserController {

    @Autowired
    private UserRepo userRepo;


    @GetMapping("/get")
    public Iterable<User> getAll() {
        return userRepo.findAll();
    }

    @RequestMapping(value = "/kupp")
    @ResponseBody
    public Collection<User> getById(@RequestParam("id") int id) {
        return userRepo.findAllActiveUsers(1);
    }
}