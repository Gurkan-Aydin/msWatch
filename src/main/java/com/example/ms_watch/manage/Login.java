package com.example.ms_watch.manage;


import com.example.ms_watch.repo.UserRepo;
import com.github.kevinsawicki.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {

    UserRepo userRepo;
    UserController userController = new UserController();

    @GetMapping(name = "/")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public void loginFrom(@RequestParam("userName") String userName,@RequestParam("password") String password){

    }




}
