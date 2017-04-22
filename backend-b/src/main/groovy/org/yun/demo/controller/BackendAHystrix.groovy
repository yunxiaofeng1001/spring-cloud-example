package org.yun.demo.controller

import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestParam

/**
 * Created by yunxiaofeng on 2017/4/18.
 */
@Component
class BackendAHystrix implements BackendAService{
    @Override
    Integer add(@RequestParam(value = 'a') Integer a, @RequestParam(value = 'b') Integer b) {
        return 321
    }
}
