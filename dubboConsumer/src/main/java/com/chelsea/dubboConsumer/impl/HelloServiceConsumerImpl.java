package com.chelsea.dubboConsumer.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chelsea.dubboConsumer.HelloServiceConsumer;
import com.chelsea.dubboInterface.HelloService;

@Service("helloServiceConsumer")
public class HelloServiceConsumerImpl implements HelloServiceConsumer {

    @Reference
	HelloService helloService;

	public String sayHello(String name) {
		return helloService.sayHello(name);
	}

}
