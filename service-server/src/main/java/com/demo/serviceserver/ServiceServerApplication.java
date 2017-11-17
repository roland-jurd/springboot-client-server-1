package com.demo.serviceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.demo")
public class ServiceServerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ServiceServerApplication.class, args);
    }
}
