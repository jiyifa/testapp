package com.test.controller;

import com.test.view.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public Object test(){
        return "test";
    }

    @RequestMapping("/httpclienttest")
    public Object httpclienttest(RequestParam requestParam){
        System.out.println(requestParam.getThreadId()+"\t"+requestParam.getThreadName());
        return "test";
    }
}
