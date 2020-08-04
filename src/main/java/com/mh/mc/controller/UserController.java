package com.mh.mc.controller;

import com.mh.mc.entity.User;
import com.mh.mc.entity.UserExample;
import com.mh.mc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * createtime:2020
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("list")
    public List<User> list() {
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0);
        return userService.selectByExample(example);
    }

}
