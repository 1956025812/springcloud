package com.example.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam String name) {
        return "8766 eurekaclient is accessing...." + name;
    }

}
