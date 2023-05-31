package com.devskiller.tasks.blog;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BlogControllerAdvice {

	@ExceptionHandler(IllegalArgumentException.class)

	public ResponseEntity handleException(IllegalArgumentException e){
		return  new ResponseEntity("Post Not found", HttpStatus.NOT_FOUND);
	}

}
