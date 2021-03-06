package br.com.spring.eureka.l4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaArticleL4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaArticleL4Application.class, args);
	}

}

