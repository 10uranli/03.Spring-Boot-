package com.tutorial._03.springboot.sample._01.helloboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public Hello getHello(){
        return new Hello("Onur","Hello Boot");
    }
}
