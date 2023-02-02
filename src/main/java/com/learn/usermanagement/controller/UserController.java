

package com.learn.usermanagement.controller;
import com.learn.usermanagement.model.User;
import org.springframework.web.bind.annotation.*;
@RestController@RequestMapping("/user")
public class UserController {    @GetMapping    public User getUser()
    {        User user = new User();
            user.setId("12335");
            user.setName("Joe");
            return user;    }}