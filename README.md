# springcloud 入门样例分支 --V1 版本

简单的服务注册，服务发现与调用。

特色：采用共享 api 接口的方式

### 模块介绍
- springboot-eureka                   eureka server 应用模块
- springboot-provider                 服务端提供者模块
- restful-provider-api-definition     共享的api接口模块   
- springboot-feign-comsumer           采用feign方式的消费端模块

### 启动方式
springboot-eureka 开放的端口是8081，springboot-provider 开放的端口是8082，springboot-feign-comsumer 开放的端口是8084， 启动各自的springboot application 类。

打开浏览器输入：http://localhost:8081 就能看到 eureka 注册中心界面了。

### 采用的一下springCloud 技术

springCloud eureka  作为服务注册中心

springCloud openFeign 作为消费端远程调用的客户端

springboot actuator 作为服务检查状态检查





