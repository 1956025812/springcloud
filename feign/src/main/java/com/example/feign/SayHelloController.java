package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @Autowired
    private SayHelloService sayHelloService;

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam String name) {
        return this.sayHelloService.sayHello(name);
    }

}
