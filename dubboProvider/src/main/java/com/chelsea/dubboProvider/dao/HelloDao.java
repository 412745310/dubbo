package com.chelsea.dubboProvider.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {

    public String sayHello(String name) {
        return "hello " + name;
    }

}
