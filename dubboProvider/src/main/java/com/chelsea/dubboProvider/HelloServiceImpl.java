package com.chelsea.dubboProvider;

import org.springframework.stereotype.Service;

import com.chelsea.dubboInterface.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		return "hello " + name;
	}

}
