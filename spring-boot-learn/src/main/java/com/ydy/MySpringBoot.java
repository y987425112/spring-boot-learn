package com.ydy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
@SpringBootApplication
public class MySpringBoot {
	
	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}
	public static void main(String[] args) {
		
//		SpringApplication.run(MySpringBoot.class, args);
		
		SpringApplication springApplication=new SpringApplication(MySpringBoot.class);
//		springApplication.setApplicationContextClass(applicationContextClass);
				springApplication.run(args);
	}

}
