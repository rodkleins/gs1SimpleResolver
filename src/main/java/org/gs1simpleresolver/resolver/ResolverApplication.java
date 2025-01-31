package org.gs1simpleresolver.resolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan({ "org.gs1simpleresolver.controller" })
public class ResolverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResolverApplication.class, args);
	}

	
	
}
