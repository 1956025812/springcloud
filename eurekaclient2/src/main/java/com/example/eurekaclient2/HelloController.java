package com.example.eurekaclient2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam String name) {
        return "8767 eurekaclient is accessing...." + name;
    }

}
