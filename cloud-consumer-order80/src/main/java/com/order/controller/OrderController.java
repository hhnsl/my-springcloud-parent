package com.order.controller;

import com.common.entity.CommonResult;
import com.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT/";

    @GetMapping("query")
    public CommonResult<List<Payment>> queryAll() {
        return restTemplate.getForObject(PAYMENT_URL + "payment/query" , CommonResult.class);
    }

}
