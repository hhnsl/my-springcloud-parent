package com.provider.controller;

import com.common.entity.CommonResult;
import com.common.entity.Payment;
import com.netflix.discovery.converters.Auto;
import com.provider.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("query")
    public CommonResult<List<Payment>> queryAll() {
        List<Payment> all = paymentService.findAll();
        log.info("返回查询结果");
        return new CommonResult<>(200, "当前调用端口号:" + serverPort, all);
    }

    @GetMapping("discovery")
    public Object discovery() {
        for (String service : discoveryClient.getServices()) {
            System.out.println("eureka服务名称*******" + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        for (ServiceInstance instance : instances) {

        }
        return this.discoveryClient;
    }

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
