package com.employee.proxy;

import com.employee.domain.EmployeeInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "orderservice/os")
public interface EmployeeServiceProxy {
    @RequestMapping(value = "/employee/feignClient/{id}", method = RequestMethod.GET)
    String[]   getVolunteers(@PathVariable("id") String id);
}


