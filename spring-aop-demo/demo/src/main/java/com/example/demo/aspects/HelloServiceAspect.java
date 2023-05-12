package com.example.demo.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 5/10/2023
 *
 * @author : Admin
 * @date : 5/10/2023
 * @project : spring-aop-demo
 */
@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* services.HelloService.hello(..))")
    public void before() {
        System.out.println("Before hello() method");
    }

    @After("execution(* services.HelloService.hello(..))")
    public void after() {
        System.out.println("After hello() method");
    }


}

