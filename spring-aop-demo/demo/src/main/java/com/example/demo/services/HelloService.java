package com.example.demo.services;


import org.springframework.stereotype.Service;

/**
 * Created by Admin on 5/10/2023
 *
 * @author : Admin
 * @date : 5/10/2023
 * @project : spring-aop-demo
 */
@Service
public class HelloService {

    public void hello(String name) {
        String message = "Hello, " + name + "!";
        System.out.println( message );
    }
}
