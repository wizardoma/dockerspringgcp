package com.wizardom.eaurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EaurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaurekaclientApplication.class, args);
    }

}
