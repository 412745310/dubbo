package com.chelsea.dubboProvider;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProviderTest {

	ApplicationContext ctx = null;

	@Before
	public void init() {
		try{
			ctx = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/application.xml");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public void testStartProvider() {
		synchronized (DubboProviderTest.class) {
			while (true) {
				try {
					DubboProviderTest.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
