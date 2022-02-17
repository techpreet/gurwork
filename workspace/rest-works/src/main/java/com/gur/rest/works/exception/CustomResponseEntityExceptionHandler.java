package com.gur.rest.works.exception;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> userNotFoundException(Exception exception, WebRequest request){
		exception.printStackTrace();
		var response = new ExceptionResponse();
		response.setMesssage(exception.toString());
		response.setDetails(request.getDescription(false));
		response.setDate(new Date());
		
		
		return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
		
	}
	

		@ExceptionHandler(Exception.class)
		public ResponseEntity<Object> handleAllException(Exception exception, WebRequest request){
			exception.printStackTrace();
			var response = new ExceptionResponse();
			response.setMesssage(exception.getMessage());
			response.setDetails(request.getDescription(false));
			response.setDate(new Date());
			
			
			return new ResponseEntity<Object>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}


		@Override
		protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
				HttpHeaders headers, HttpStatus status, WebRequest request) {
			ex.printStackTrace();
			
			var response = new ExceptionResponse();
			response.setMesssage(ex.getMessage());
			response.setDetails(request.getDescription(false));
			response.setDate(new Date());
			
			
			return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
		}

}
