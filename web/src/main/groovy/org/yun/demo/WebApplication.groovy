package org.yun.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * Created by yunxiaofeng on 2017/4/19.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
class WebApplication {

    static void main(String[] args) {
        SpringApplication.run WebApplication, args
    }
}

