package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Admin on 5/10/2023
 *
 * @author : Admin
 * @date : 5/10/2023
 * @project : spring-aop-demo
 */
@Configuration
@ComponentScan(basePackages = {"services", "aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {


}
