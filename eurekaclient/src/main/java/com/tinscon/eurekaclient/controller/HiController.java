package com.tinscon.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tinscon
 * @Date: 2018/8/16 18:28
 * @Description:
 */
@RestController
public class HiController {
    @Value("${server.port}")
    String port ;
    @GetMapping
    public String home (@RequestParam String name){
        return "hi" + name + ",i am from port:" + port ;
    }
}
