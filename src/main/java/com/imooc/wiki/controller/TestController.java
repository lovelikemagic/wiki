package com.imooc.wiki.controller;

import com.imooc.wiki.domain.Test;
import com.imooc.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：ToDo
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
