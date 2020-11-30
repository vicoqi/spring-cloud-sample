package com.vic.springboot.restful.service.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 对于Spring Cloud Feign入门示例的一点思考
 */
public interface IUserService {

    @GetMapping("get/users/{id}")
    String getUser(@PathVariable("id") String id);
}
