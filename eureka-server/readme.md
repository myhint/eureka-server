### Project Documentation

#### 1.总共分为3个Module:
 * eureka-server `注册中心`
 ```
 eureka-server 服务启动后，在浏览器地址栏访问 http://localhost:8761/ 即可进入Eureka监控管理后台
 
 ```
 * provider-client `服务提供方`
 * consumer-client `服务消费方`
 
#### 2.Spring Cloud与Dubbo有何区别？
 * Spring Cloud 调用服务是通过Rest Api
 * Dubbo 调用服务是RPC远程调用的方式
 
#### 3.Eureka常规配置项

```yaml
# application.yml 配置示例如下：

# 端口默认为 8761
server:
  port: 8761

eureka:
  instance:
    hostname: eureka-server # eureka注册中心主机名
  client:
    # 表示注册中心成功运行起来后，eureka不会将自身也注册进去
    register-with-eureka: false
    # 表示注册中心成功运行后，不会去调用自身注册在eureka上的服务
    fetch-registry: false 
    # 注册中心服务所在IP地址
    service-url:
      defaultZone: http://localhost:8761/eureka/
```

#### 4.Provider-Client 常规配置项

```yaml

server:
  port: 8091

spring:
  application:
    name: product-provider

eureka:
  instance:
    prefer-ip-address: true # 使用服务的ip地址注册至Eureka注册中心
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
      
```
      
#### 5.Consumer-Client 常规配置项

```yaml

server:
  port: 8082

spring:
  application:
    name: product-consumer

eureka:
  instance:
    prefer-ip-address: true # 使用自身ip地址注册至Eureka注册中心
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/

```