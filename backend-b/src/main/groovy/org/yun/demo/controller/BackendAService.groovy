package org.yun.demo.controller

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

/**
 * Created by yunxiaofeng on 2017/4/18.
 */
@FeignClient(name = "backend-a",fallback = BackendAHystrix.class)
interface BackendAService {

    @RequestMapping(path = "/add",method = RequestMethod.GET)
    Integer add(@RequestParam(value = 'a') Integer a, @RequestParam(value = 'b') Integer b)
}