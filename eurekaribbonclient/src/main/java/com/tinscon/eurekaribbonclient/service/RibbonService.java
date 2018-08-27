package com.tinscon.eurekaribbonclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: tinscon
 * @Date: 2018/8/20 13:30
 * @Description:
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate ;
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi (String name){
        return restTemplate.getForObject("http://eurekaclient/hi?name=" + name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+ name +"sorry,error!";
    }
}
