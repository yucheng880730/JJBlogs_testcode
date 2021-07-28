package com.example.chapter1.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoController {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo(){
        return "Hello Leo!";
    }

    @RequestMapping(value = "/path/{id}", method = RequestMethod.GET)
    public String pathVariable(@PathVariable("id") String id) {
        return "ID:" + id;
    }

    @RequestMapping(value = "/path", method = RequestMethod.GET)
    public String requestParamGet(@RequestParam("id") String id){
        return "ID:" + id;
    }

    @RequestMapping(value = "/path", method = RequestMethod.POST)
    public String requestParamPost(@RequestParam("id") String id){
        return "ID:" + id;
    }

    @ModelAttribute
    void beforeInvokingHandlerMethod(HttpServletRequest request) {
        request.setAttribute("id", "Hello world!");
    }

    // @RequestAttribute用於取得過濾器或攔截器建立的、預先存在的請求屬性
    @RequestMapping(value = "/req/attr", method = RequestMethod.GET)
    public String requestAttribute(@RequestAttribute("id") String id) {
        return "ID:" + id;
    }

}
