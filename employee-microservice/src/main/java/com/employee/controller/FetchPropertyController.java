package com.employee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/properties")
public class FetchPropertyController {
   // @Value("${config.server.employee-key}")
    private String propertyKey;

    @GetMapping
    public String fetchProperty(){
        return  propertyKey;
    }


}
