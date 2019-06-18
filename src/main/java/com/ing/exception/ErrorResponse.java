package com.ing.exception;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @NoArgsConstructor @ToString
public class ErrorResponse implements Serializable{
		
	private static final long serialVersionUID = 6633807701237888453L;
	private String message;
	public ErrorResponse(String message){
		this.message = message;
	}
}
