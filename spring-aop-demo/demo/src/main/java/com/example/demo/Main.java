package com.example.demo;


import com.example.demo.services.HelloService;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {

	public static void main(String[] args) {

			HelloService service = new HelloService();

			service.hello("John");


	}

}
