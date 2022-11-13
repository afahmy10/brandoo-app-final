package com.brandoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.brandoo.*")
public class BrandoApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(BrandoApplication.class, args);
	}

}
