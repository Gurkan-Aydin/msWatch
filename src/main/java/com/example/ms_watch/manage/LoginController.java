package com.example.ms_watch.manage;


import com.example.ms_watch.models.User;
import com.example.ms_watch.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    public UserRepo userRepo;

    public static User activeUser;


    @GetMapping(name = "/")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String addUser(@ModelAttribute("name") String name, @ModelAttribute("lastName") String lastName,
                        @ModelAttribute("userName") String userName, @ModelAttribute("password") String password,
                        @ModelAttribute("birthday") SimpleDateFormat birthday, @ModelAttribute("email") String email ){
        User user = new User(name, lastName, userName, password,email, ""+birthday, ""+LocalDate.now(), 1);
        userRepo.save(user);
        return "login";
    }


    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String index(@ModelAttribute("userName") String userName,@ModelAttribute("password") String password){
        if (userRepo.getLogin(userName, password).isEmpty()) {
            System.out.println("wrong");
            return "login";
        } else {
            return "index";
        }

    }


    @RequestMapping(value = "/go{page}", method = RequestMethod.GET)
    public String goPage(@PathVariable String  page ) {
        return page;
    }






}
