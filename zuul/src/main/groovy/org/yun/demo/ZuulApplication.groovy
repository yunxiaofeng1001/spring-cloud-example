package org.yun.demo

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

/**
 * Created by yunxiaofeng on 2017/4/19.
 */
@SpringCloudApplication
@EnableZuulProxy
class ZuulApplication {

    static void main(String[] args) {
        SpringApplication.run ZuulApplication, args
    }
}
