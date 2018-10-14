package com.blake.productprovider.controller;

import com.blake.productprovider.service.ProductProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Blake on 2018/10/14
 */
@RestController
@RequestMapping("/api")
public class ProductProvideController {

    @Autowired
    private ProductProvideService productProvideService;

    @GetMapping("/product/provide")
    public String getProduct() {
        System.out.println("====== 端口8091标识的应用在为您服务 ======");
        return productProvideService.getProduct();
    }

}
