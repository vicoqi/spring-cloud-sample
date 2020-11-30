package com.vic.springboot.eureka.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    // 这里配置的是我们要调用的服务实例名，我们要调用USER服务，因此这里的地址是USER
    private String rest_url_prefix = "http://user-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("get/users/{id}")
    public String getUser(@PathVariable("id") String id) {
        System.out.println("接收到请求[/user/" + id + "]");

        // 调用USER服务中的/users/{id}服务
        return restTemplate.getForObject(rest_url_prefix + "get/users/" + id, String.class);
    }
}
