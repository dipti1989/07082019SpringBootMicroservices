package com.springboot.microservices.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@PropertySource("classpath:mysqldb.properties")
@EnableJpaRepositories(basePackages= {"com.springboot.microservices.clients.repository"})
@EnableEurekaClient 	// Enable eureka client. It inherits from @EnableDiscoveryClient.
public class SpringEurekaImageApp  {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaImageApp.class, args);
	}

}
