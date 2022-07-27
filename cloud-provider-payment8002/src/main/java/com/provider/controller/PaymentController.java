package com.provider.controller;

import com.common.entity.CommonResult;
import com.common.entity.Payment;
import com.provider.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("query")
    public CommonResult<List<Payment>> queryAll() {
        List<Payment> all = paymentService.findAll();
        log.info("返回查询结果");
        return new CommonResult<>(200, "当前调用端口号:" + serverPort, all);
    }

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
