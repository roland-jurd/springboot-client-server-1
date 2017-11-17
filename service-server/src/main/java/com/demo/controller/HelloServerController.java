package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by rolandjurd on 2017/11/12.
 */
@RestController
@RequestMapping("/rest/hello/server")
public class HelloServerController {
    
    
    @GetMapping
    public String hello() {
        return "Hello World!";
    }
    
    
}
