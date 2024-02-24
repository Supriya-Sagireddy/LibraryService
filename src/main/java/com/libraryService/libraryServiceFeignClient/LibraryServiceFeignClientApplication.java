package com.libraryService.libraryServiceFeignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.libraryService")
public class LibraryServiceFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryServiceFeignClientApplication.class, args);
	}

}
