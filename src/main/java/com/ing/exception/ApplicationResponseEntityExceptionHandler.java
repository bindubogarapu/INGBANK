package com.ing.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationResponseEntityExceptionHandler.class);

	@ExceptionHandler(value = { UserNotFoundException.class, RuntimeException.class } )
	public ResponseEntity<ErrorResponse> applicationExceptionsHandler(Exception exception) {
		LOGGER.error(exception.getMessage());
		ErrorResponse response = new ErrorResponse(exception.getMessage());
		
		HttpStatus status = HttpStatus.BAD_REQUEST;

		if (exception instanceof UserNotFoundException) {
			status = HttpStatus.METHOD_NOT_ALLOWED;
		}
		return new ResponseEntity<>(response, status);
	}
}
