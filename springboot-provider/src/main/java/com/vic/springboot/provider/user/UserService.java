package com.vic.springboot.provider.user;

import com.vic.springboot.restful.service.api.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService implements IUserService {

    /**
     * 貌似通过反射 能找到父接口中的注解
     * @param id
     * @return
     */
    @Override
    public String getUser(@PathVariable("id") String id) {
        System.out.println("接收到请求[/users/" + id + "]");
        return "testUser by "+ id;
    }

}
