package com.wizardom.journal_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class JournalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JournalServerApplication.class, args);
    }


    @GetMapping("home")
    @ResponseBody
    public String getHome(){
        return "This is the Journal Server service";
    }
}
