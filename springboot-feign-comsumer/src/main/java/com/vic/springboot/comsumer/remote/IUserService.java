package com.vic.springboot.comsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IHelloService
 * 配置服务提供者：single-provider 是服务提供者的 application.name
 */
@FeignClient("user-provider")
public interface IUserService extends com.vic.springboot.restful.service.api.IUserService {


}
