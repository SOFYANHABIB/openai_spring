package com.openai.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatCompletionResponse {
	
	private List<Choice> choices;
	
	
	
	public List<Choice> getChoices() {
		return choices;
	}



	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}



	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Choice {
		
		private int index;
		
		private ChatMessage message;

		public Choice(int index, ChatMessage message) {
			super();
			this.index = index;
			this.message = message;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public ChatMessage getMessage() {
			return message;
		}

		public void setMessage(ChatMessage message) {
			this.message = message;
		}
		
		
	}

}
