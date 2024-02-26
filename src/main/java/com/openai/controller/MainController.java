package com.openai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.openai.model.ChatCompletionRequest;
import com.openai.model.ChatCompletionResponse;

@RestController

public class MainController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/hitOpenaiApi")
	public String getOpenaiResponse(@RequestBody String prompt) {
		
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest("gpt-3.5-turbo", prompt);
		
		ChatCompletionResponse response = restTemplate.postForObject("https://api.openai.com/v1/chat/completions", chatCompletionRequest, ChatCompletionResponse.class);
		
		return response.getChoices().get(0).getMessage().getContent();
		
	}

}
