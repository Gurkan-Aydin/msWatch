package com.example.ms_watch.manage;


import com.example.ms_watch.repo.UserRepo;
import com.example.ms_watch.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/"})
public class UserController {

    @Autowired
    private UserRepo userRepo;


    @GetMapping("/get")
    public Iterable<User> getA() {
        return userRepo.findAllActiveUsers();
    }
}
