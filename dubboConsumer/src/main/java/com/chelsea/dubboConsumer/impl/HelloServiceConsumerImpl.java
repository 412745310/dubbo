package com.chelsea.dubboConsumer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chelsea.dubboConsumer.HelloServiceConsumer;
import com.chelsea.dubboInterface.HelloService;

@Service("helloServiceConsumer")
public class HelloServiceConsumerImpl implements HelloServiceConsumer {

	@Autowired
	HelloService helloService;

	public String sayHello(String name) {
		return helloService.sayHello(name);
	}

}
