package com.tinscon.eurekafeignclient.interf;

import com.tinscon.eurekafeignclient.config.FeignConfig;
import com.tinscon.eurekafeignclient.interfaceImpl.HiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "eurekaclient",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping("/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name) ;
}
