package com.openai.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ChatCompletionRequest {
	
	private String model;
	private List<ChatMessage> messages;
	private int max_tokens = 50;
	
	public ChatCompletionRequest(String model, String prompt) {
		super();
		this.model = model;
		this.messages = new ArrayList<ChatMessage>();
		this.messages.add(new ChatMessage("user", prompt));
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<ChatMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<ChatMessage> messages) {
		this.messages = messages;
	}

	public int getMax_tokens() {
		return max_tokens;
	}

	public void setMax_tokens(int max_tokens) {
		this.max_tokens = max_tokens;
	}
	
	

}
