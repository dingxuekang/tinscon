package com.tinscon.eurekacliento.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tinscon
 * @Date: 2018/8/20 13:38
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
