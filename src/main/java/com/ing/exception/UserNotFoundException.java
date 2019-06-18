package com.ing.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @NoArgsConstructor @ToString
public class UserNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -5874942464236382791L;
	private static final String MESSAGE = "username/passward is inalid ";

	public UserNotFoundException(String username){
		super(MESSAGE);
	}
}
