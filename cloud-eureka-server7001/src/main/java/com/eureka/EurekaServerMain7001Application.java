package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: EurekaServerMain7001Application
 * @description:
 * @Version: 1.0
 * @author: wenXiongTao
 * @create: 2022-06-20 22:17
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMain7001Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain7001Application.class, args);
    }
}
