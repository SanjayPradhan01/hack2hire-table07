package com.dbs.equity.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableAutoConfiguration
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.dbs")
public class DBSSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DBSSpringApplication.class, args);
	}

}
