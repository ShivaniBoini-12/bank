package com.bt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bt.exceptions.IdNotfound.IdNotFound;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(IdNotFound.class)
	public ResponseEntity<String> IdNotFoundHandler(IdNotFound e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
	}
	
	@ExceptionHandler(InsufficientBalance.class)
	public ResponseEntity<String> InsufficientBalanceHandler(InsufficientBalance e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.OK);
	}
}
