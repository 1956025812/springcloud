package com.example.feign;

import org.springframework.stereotype.Component;

/**
 * SayHelloService接口的Hystrix回退类  实现SayHelloService接口即可
 */
@Component
public class SayHelloServiceHystrix implements SayHelloService {

    @Override
    public String sayHello(String name) {
        return "hello " + name + ", sorry  i am down...";
    }
}
