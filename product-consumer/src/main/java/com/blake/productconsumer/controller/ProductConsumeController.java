package com.blake.productconsumer.controller;

import com.blake.productconsumer.service.ProductConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Blake on 2018/10/14
 */
@RestController
@RequestMapping("/api")
public class ProductConsumeController {

    @Autowired
    private ProductConsumeService productConsumeService;

    @GetMapping("/product/consume")
    public String subscribeProduct(String name) {

        return "客户：" + name + "成功抢购到产品 [" + productConsumeService.subscribeProduct() + "]";
    }

}
