package it.giorgio.quarto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloMessage {
	private String message;
	
	public HelloMessage(String message) {
		this.message = message;
	}
}