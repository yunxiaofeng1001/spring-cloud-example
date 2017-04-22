package org.yun.demo.controller

import groovy.transform.CompileStatic
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody


/**
 * Created by yunxiaofeng on 2017/4/17.
 */
@CompileStatic
@Controller
class BackendAController {

    private final Logger logger = LoggerFactory.getLogger(BackendAController.class)

    @Autowired
    DiscoveryClient client

    @ResponseBody
    @GetMapping(path = "/add")
    public Integer add(@RequestParam(name = "a") Integer a,@RequestParam(name = "b") Integer b){
        ServiceInstance instance = client.getLocalServiceInstance()
        Integer res = a + b
        logger.info("/add, host:" + instance.getHost()
                + ", service_id:" + instance.getServiceId()
                + ", result:" + res);
        return res
    }

}
