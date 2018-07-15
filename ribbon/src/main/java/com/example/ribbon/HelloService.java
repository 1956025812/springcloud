package com.example.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String sayHello(String name) {
        // eurekaclient对应的服务名称 ribbon会自动选择实例并解析为对应的url地址 然后访问俩个客户端对应的controller
        return this.restTemplate.getForObject("http://eurekaclient/sayHello?name=" + name, String.class);
    }

    // hystrix的回退方法
    public String helloError(String name) {
        return "hello " + name + ", sorry  i am down...";
    }

}
