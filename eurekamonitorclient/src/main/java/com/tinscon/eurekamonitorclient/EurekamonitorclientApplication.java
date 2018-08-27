package com.tinscon.eurekamonitorclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class EurekamonitorclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekamonitorclientApplication.class, args);
    }
}
