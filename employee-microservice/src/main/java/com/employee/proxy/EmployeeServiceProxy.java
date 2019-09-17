package com.employee.proxy;

import com.employee.domain.EmployeeInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@FeignClient(url="",name = "orderservice-microservice")
public interface EmployeeServiceProxy {

    @RequestMapping("/employee/find/{id}")
    public EmployeeInfo findById(@PathVariable(value="id") Long id);

    @RequestMapping("/employee/findall")
    public Collection<EmployeeInfo> findAll();

}


