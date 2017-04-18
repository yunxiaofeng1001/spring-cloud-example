package org.yun.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

/**
 * Created by yunxiaofeng on 2017/4/18.
 */
@RestController
class BackendBController {



//    @Autowired
//    BackendService backendService

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(path = "/testadd",method = RequestMethod.GET)
    public String testadd(){
        return restTemplate.getForEntity("http://backend-a/add?a=10&b=20",String.class).getBody()
    }


}
