package com.zxcris.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zxcris.bean.DefaultBean;

@Service
public class DefaultServiceImpl implements DefaultApiService{
 
    public String defaultMethod(String str) {
        DefaultBean defaultBean = new DefaultBean();
        defaultBean.setStr(str);
        defaultBean.setMethodName("defaultMethod");
        defaultBean.setTimestamp(System.currentTimeMillis());
        return defaultBean.toString();
    }

}
