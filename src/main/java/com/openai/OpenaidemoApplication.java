package com.openai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.Value;

@SpringBootApplication
public class OpenaidemoApplication {
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(OpenaidemoApplication.class, args);
		
		}
	
	@Bean
	public RestTemplate restTemplate() {
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getInterceptors().add(((request, body, execution) ->{
			request.getHeaders().add("Authorization", "Bearer "+ "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");
			
				return execution.execute(request, body);
		}));
		
		return restTemplate;
	}

}
