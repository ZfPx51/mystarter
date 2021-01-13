package com.example.controller;

import com.abc.splicingspringbootstater.Service.SplicingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangfan
 */
@RestController
public class TestController {

    @Resource
    private SplicingService splicingService;

    @RequestMapping("/test")
    public String getNewChar(String word)
    {
        return splicingService.Splicing(word);
    }
}
