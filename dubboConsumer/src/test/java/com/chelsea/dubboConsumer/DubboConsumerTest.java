package com.chelsea.dubboConsumer;

import java.util.concurrent.Future;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

public class DubboConsumerTest {

    ApplicationContext ctx = null;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("classpath:application.xml");
    }

    /**
     * 异步调用
     * 
     * @throws Exception
     */
    @Test
    public void testAsync() throws Exception {
        HelloServiceConsumer service = (HelloServiceConsumer) ctx.getBean("helloServiceConsumer");
        String result = service.sayHello("张三");
        Future<String> future = RpcContext.getContext().getFuture();
        result = future.get();
        System.out.print(result);
    }

}
