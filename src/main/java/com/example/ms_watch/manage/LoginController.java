package com.example.ms_watch.manage;


import com.example.ms_watch.models.Status;
import com.example.ms_watch.models.User;
import com.example.ms_watch.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.management.Query;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    JdbcTemplate jdbcTemplate;

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
        jdbcTemplate.update("INSERT INTO user (name, lastname, user_name, password,email, birthday, open_date, type_id)VALUES(?,?,?,?,?,?,?,?)",
                name, lastName, userName, password,email, ""+birthday, ""+LocalDate.now(), 1 );
        return "login";
    }


    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String index(@ModelAttribute("userName") String userName,@ModelAttribute("password") String password){
        try {

            User user = jdbcTemplate.queryForObject("select * from user where user_name = '" + userName + "' and password = '" + password + "'",
                    new RowMapper<User>() {
                        @Override
                        public User mapRow(ResultSet rs, int rowNumber) throws SQLException {
                            User user = new User();
                            user.setId(rs.getInt("id"));
                            user.setName(rs.getString("name"));
                            user.setLastName(rs.getString("lastname"));
                            user.setUserName(rs.getString("user_name"));
                            user.setPassword(rs.getString("password"));
                            user.setEmail(rs.getString("email"));
                            user.setBirthday(rs.getString("birthday"));
                            user.setOpenDate(rs.getString("open_date"));
                            user.setTypeId(rs.getInt("type_id"));
                            return user;
                        }
                    });

            activeUser = user;
            return jdbcTemplate.queryForObject("select status_name from status where id = " + user.getTypeId()+"", String.class);

        }catch (Exception exception){
            return "login";
        }
    }


    @RequestMapping(value = "/go{page}", method = RequestMethod.GET)
    public String goPage(@PathVariable String  page ) {
        return page;
    }






}
