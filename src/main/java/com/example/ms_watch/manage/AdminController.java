package com.example.ms_watch.manage;


import com.example.ms_watch.models.User;
import com.example.ms_watch.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static List<User> userList = new ArrayList<User>();



    @RequestMapping(value = "/updateUser", method = RequestMethod.GET)
    public String updateUser(@ModelAttribute("id") int id,@ModelAttribute("name") String name, @ModelAttribute("lastName") String lastName,
                             @ModelAttribute("userName") String userName, @ModelAttribute("password") String password,
                             @ModelAttribute("birthday") SimpleDateFormat birthday, @ModelAttribute("email") String email,
                             @ModelAttribute("typeId") String typeId ){
        jdbcTemplate.update("update user set name = '"+ name +"' , last_name = '"+ lastName +
                "', user_name = '"+ userName +"', password = '"+ password +"'," +
                "birthday = '"+ birthday +"', open_date = '"+ (""+ LocalDate.now()) +
                "', email = '"+ email +"', type_id = '"+typeId+"' where id = "+id);
        return "admin";
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public String getUsers(){
        userList.addAll(userRepo.findUsers());
        return "admin";
    }

}
