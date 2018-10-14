package com.blake.productprovider.service;

import org.springframework.stereotype.Service;

/**
 * Created by Blake on 2018/10/14
 */
@Service
public class ProductProvideService {

    public String getProduct() {

        return "新产品：由Spring Cloud 微服务提供方负责生产";
    }
}
