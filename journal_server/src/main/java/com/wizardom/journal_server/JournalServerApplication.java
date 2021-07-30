package com.wizardom.journal_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class JournalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JournalServerApplication.class, args);
    }

}
