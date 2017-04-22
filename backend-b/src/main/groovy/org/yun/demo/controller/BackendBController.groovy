package org.yun.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.yun.demo.service.BackendBService

/**
 * Created by yunxiaofeng on 2017/4/18.
 */
@RestController
class BackendBController {

    @Autowired
    BackendBService backendBService
    @Autowired
    BackendAService backendService
//
//    @Autowired
//    RestTemplate restTemplate;

    @RequestMapping(path = "/testadd", method = RequestMethod.GET)
    public String testadd() {

        return backendService.add(10,20)


//        return backendBService.backendB(10,20)

    }


}
