package com.chelsea.dubboConsumer;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsumerTest{

	ApplicationContext ctx = null;
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("classpath*:spring/spring.xml");
	}
	
	@Test
	public void testConsumer(){
		HelloServiceConsumer service = (HelloServiceConsumer)ctx.getBean("helloServiceConsumer");
		String result = service.sayHello("张三");
		System.out.print(result);
//		synchronized (DubboConsumerTest.class) {
//			while (true) {
//				try {
//					DubboConsumerTest.class.wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}

}
