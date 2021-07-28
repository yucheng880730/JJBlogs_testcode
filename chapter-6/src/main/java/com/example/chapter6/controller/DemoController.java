package com.example.chapter6.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${com.leo.name}")
    private String name;

    @Value("${com.leo.want}")
    private String want;

    @Value("${com.leo.sentence}")
    private String sentence;

    @Value("${com.leo.my.age}")
    private String age;

    @Value("${com.leo.my.gender}")
    private String gender;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return name + "," + want;
    }

    @RequestMapping(value = "/sentence", method = RequestMethod.GET)
    public String sentence() {
        return sentence;
    }

    @RequestMapping(value = "/my", method = RequestMethod.GET)
    public String myProperties() {
        return "sex：" + gender + ", age: " + age;
    }

}
