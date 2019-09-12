package com.employee.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="order-service" )
public interface HelloServiceProxy {

    @RequestMapping("/rest/hello/server")
    public String gethello();


}