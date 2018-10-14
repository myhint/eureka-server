package com.blake.productconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费方
 * <p>
 * 1）需要结合RestTemplate 远程调用服务
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启服务发现功能
public class ProductConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumerApplication.class, args);
    }

    @LoadBalanced // 开启负载均衡机制
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
