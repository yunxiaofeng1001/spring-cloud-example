package org.yun.demo

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * Created by yunxiaofeng on 2017/4/17.
 */
@CompileStatic
@EnableDiscoveryClient
@SpringBootApplication
class BackendBApplication {
    static void main(String[] args) {
        SpringApplication.run BackendBApplication, args
    }
}
