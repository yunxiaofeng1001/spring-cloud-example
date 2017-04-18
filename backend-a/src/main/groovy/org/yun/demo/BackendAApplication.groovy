package org.yun.demo

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.context.annotation.ComponentScan

/**
 * Created by yunxiaofeng on 2017/4/17.
 */
@CompileStatic
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
class BackendAApplication {
    static void main(String[] args) {
        SpringApplication.run BackendAApplication, args
    }
}
