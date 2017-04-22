package org.yun.demo.service

import com.netflix.hystrix.HystrixCommand
import com.netflix.ribbon.proxy.annotation.Hystrix
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.yun.demo.controller.BackendAHystrix
import org.yun.demo.controller.BackendAService

/**
 * Created by yunxiaofeng on 2017/4/18.
 */
@Service
class BackendBService {

    private final Logger logger = LoggerFactory.getLogger(BackendBService.class)

    @Autowired
    BackendAService backendService

//    @Autowired
//    RestTemplate restTemplate;



    public String backendB(Integer a, Integer b) {
        return backendService.add(a, b)

//        return restTemplate.getForEntity("http://backend-a/add?a=10&b=20",String.class).getBody()
    }

}
