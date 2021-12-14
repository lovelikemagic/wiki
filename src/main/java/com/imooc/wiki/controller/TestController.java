package com.imooc.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：ToDo
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
}
