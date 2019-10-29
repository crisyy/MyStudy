package com.zxcris.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService{

    public String userTalk(int i) {
        return i+"分";
    }
    
}
