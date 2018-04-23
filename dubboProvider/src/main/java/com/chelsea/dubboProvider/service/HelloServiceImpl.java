package com.chelsea.dubboProvider.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.chelsea.dubboInterface.HelloService;
import com.chelsea.dubboProvider.dao.HelloDao;

@Service
public class HelloServiceImpl implements HelloService {
    
    @Autowired
    private HelloDao helloDao;

    public String sayHello(String name) {
        return helloDao.sayHello(name);
    }

}
