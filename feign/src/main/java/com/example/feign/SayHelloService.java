package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * eurekaclient为提供服务的名称
 */
@FeignClient(value = "eurekaclient", fallback = SayHelloServiceHystrix.class)
@Service
public interface SayHelloService {

    @GetMapping(value = "/sayHello")
    String sayHello(@RequestParam(value = "name") String name);

}
