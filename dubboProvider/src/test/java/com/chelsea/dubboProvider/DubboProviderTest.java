package com.chelsea.dubboProvider;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.container.Main;

public class DubboProviderTest {

    ApplicationContext ctx = null;

    /**
     * 启动测试
     * 
     * @throws Exception
     */
    @Test
    public void testStart() throws Exception {
        Main.main(new String[0]);
    }

}
