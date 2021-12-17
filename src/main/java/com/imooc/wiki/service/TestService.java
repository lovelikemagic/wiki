package com.imooc.wiki.service;

import com.imooc.wiki.domain.Test;
import com.imooc.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：ToDo
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list();
    }
}
