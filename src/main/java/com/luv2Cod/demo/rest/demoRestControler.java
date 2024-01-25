package com.luv2Cod.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class demoRestControler {
        @GetMapping("/hello")
        public String doGet(){
            return "Hello World!";
        }    
}
