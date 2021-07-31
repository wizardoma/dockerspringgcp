package com.wizardom.eaurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EaurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaurekaclientApplication.class, args);
    }

    @GetMapping("")
    @ResponseBody
    public String getHome(){
        return "This is the Journal Client service";
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
