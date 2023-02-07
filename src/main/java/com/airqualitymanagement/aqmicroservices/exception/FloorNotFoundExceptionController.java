package com.airqualitymanagement.aqmicroservices.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//Global Exception
@ControllerAdvice
public class FloorNotFoundExceptionController {

	@ExceptionHandler(value = FloorNotFoundException.class)

	public ResponseEntity<Object> exception(FloorNotFoundException exception) {
		return new ResponseEntity<>("Floor not found", HttpStatus.NOT_FOUND);
	}
}
