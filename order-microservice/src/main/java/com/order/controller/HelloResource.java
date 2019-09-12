package com.order.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/hello/server")
public class HelloResource {


    @GetMapping
    public String hello() {

        return "hello server I am testing";
    }

}