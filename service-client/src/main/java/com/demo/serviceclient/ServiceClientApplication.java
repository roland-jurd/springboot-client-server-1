package com.demo.serviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.demo")
public class ServiceClientApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }
}
