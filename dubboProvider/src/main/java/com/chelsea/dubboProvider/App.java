package com.chelsea.dubboProvider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("classpath:application.xml");
        ctx.start();
        System.in.read();
    }

}
