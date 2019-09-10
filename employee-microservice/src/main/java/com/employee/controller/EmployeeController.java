package com.employee.controller;

import com.employee.proxy.EmployeeServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
    @Autowired
    protected RestTemplate restTemplate;

    @Value("${services.order.url}")
    protected String serviceurl;

    protected EmployeeServiceProxy proxy;

    @Autowired
    public EmployeeController(EmployeeServiceProxy proxy) {
        super();
        this.proxy = proxy;
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World from Employee service";
    }

    @RequestMapping(value = "/employee/{id}", produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE,
    }, method = RequestMethod.GET)
    public String[] listVolunteers(@PathVariable("id") String id) {
        System.out.println("listVolunteers via RestTemplate");
        String[] volnames = restTemplate.getForObject(serviceurl + "/order/{id}", String[].class,
                id);
        return volnames;
    }

    @RequestMapping(value = "/employee/feignClient/{id}", produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE,
    }, method = RequestMethod.GET)
    public String[] listVolunteernames(@PathVariable("id") String id) {
        System.out.println("listVolunteers via Feign");
        String[] volnames = proxy.getVolunteers(id);
        return volnames;
    }
}
