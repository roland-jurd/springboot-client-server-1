package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by rolandjurd on 2017/11/12.
 */
@RestController
@RequestMapping("/rest/hello/client")
public class HelloClientController {
    
    @GetMapping
    public String getServerHello() {
        
        final String uri = "http://localhost:8091/rest/hello/server";
        
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
    
    
}
