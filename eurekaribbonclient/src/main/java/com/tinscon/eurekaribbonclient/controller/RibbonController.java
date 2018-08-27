package com.tinscon.eurekaribbonclient.controller;

import com.tinscon.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tinscon
 * @Date: 2018/8/20 13:33
 * @Description:
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService ;
    @GetMapping("/hi")
    public String hi(@RequestParam(required = false,defaultValue = "tinscon") String name) {
        return ribbonService.hi(name);
    }

}
