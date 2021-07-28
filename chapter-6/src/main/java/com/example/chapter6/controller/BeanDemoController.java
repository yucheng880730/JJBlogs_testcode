package com.example.chapter6.controller;

import com.example.chapter6.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanDemoController {

    // 告訴compiler連動configBean class
    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/bean", method = RequestMethod.GET)
    public String beanConfig() {
        return configBean.getName() + "," + configBean.getWant();
    }

    @RequestMapping(value = "/bean/sentence", method = RequestMethod.GET)
    public String beanSentenceConfig() {
        return configBean.getSentence();
    }


}
