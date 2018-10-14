package com.blake.productconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Blake on 2018/10/14
 */
@Service
public class ProductConsumeService {

    @Autowired
    private RestTemplate restTemplate;

    public String subscribeProduct() {

        return restTemplate.getForObject("http://PRODUCT-PROVIDER/api/product/provide", String.class);
    }

}
