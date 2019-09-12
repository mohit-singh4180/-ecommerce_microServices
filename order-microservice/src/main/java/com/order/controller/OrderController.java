package com.order.controller;

import com.order.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @RequestMapping("/")
    public String home() {
        return "Hello World from order application";
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public List<String> listVolunteers(@PathVariable("id") String id) {
        System.out.println("listVolunteers");
        OrderService service = new OrderService();
        return service.findVolunteers(id);

    }
}
