package com.vic.springboot.comsumer.controller.user;

import com.vic.springboot.comsumer.remote.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IUserService userService;

    @GetMapping("get/users/{id}")
    public String getUser(@PathVariable("id") String id) {
        System.out.println("接收到请求[/user/" + id + "]");

        return userService.getUser(id);
    }
}
