package com.zxcris.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxcris.service.DefaultApiService;
import com.zxcris.service.UserService;

@RestController
public class DemoConsumerController {

    /**
     * 引入服务提供者
     */
    // com.alibaba.dubbo.config.annotation.Reference
    @Reference
    private DefaultApiService demoService;

    @Reference
    private UserService userDemoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.defaultMethod(name);
    }

    @RequestMapping("/userTalk")
    public String userTalk(int i) {
        return userDemoService.userTalk(i);
    }
}
