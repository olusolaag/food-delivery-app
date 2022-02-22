/**
 * 
 */
package com.cogent.fooddeliveryapp.advice;

/**
 * @author "Olusola Agboola"
 * @date Feb 15, 2022
 * @time 12:57:21 PM
 */
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cogent.fooddeliveryapp.apierror.ApiError;
import javax.validation.ConstraintViolationException;
import com.cogent.fooddeliveryapp.exception.NameAlreadyExistsException;
import com.cogent.fooddeliveryapp.exception.NoDataFoundException;
import com.cogent.fooddeliveryapp.exception.PersonNotFoundException;

@org.springframework.web.bind.annotation.ControllerAdvice 
// will handle all exceptions which are thrown by the controller/restcontroller
// using throws.
public class ControllerAdvice extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NameAlreadyExistsException.class)// this is reponsible for handling NameAlreadyExistsException.
	public ResponseEntity<?> nameAlreadyExistsException(NameAlreadyExistsException e){
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, "name already Exists", e);
		return buildResponseEntity(apiError);
	}
	
	@ExceptionHandler(PersonNotFoundException.class)// this is reponsible for handling NameAlreadyExistsException.
	public ResponseEntity<?> personNotFoundException(PersonNotFoundException e){
		ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, "person not found", e);
		return buildResponseEntity(apiError);
	}
	
	@ExceptionHandler(NoDataFoundException.class)// this is reponsible for handling NameAlreadyExistsException.
	public ResponseEntity<?> noDataFoundException(NoDataFoundException e){
		ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, "content not found", e);
		return buildResponseEntity(apiError);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)// this is reponsible for handling NameAlreadyExistsException.
	public ResponseEntity<?> constraintViolationException(ConstraintViolationException e){
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
		apiError.setMessage(e.getMessage());
		return buildResponseEntity(apiError);
	}
	
	@ExceptionHandler(Exception.class)// this is reponsible for handling NameAlreadyExistsException.
	public ResponseEntity<?> exception(Exception e){
		ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
		apiError.setMessage(e.getMessage());
		return buildResponseEntity(apiError);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		ApiError apiError = new ApiError(status);
		apiError.setMessage("Validation Error");
		apiError.addValidationErrors(ex.getFieldErrors());
		apiError.addValidationObjectErrors(ex.getBindingResult().getGlobalErrors());
		return buildResponseEntity(apiError);
	}
	
	private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
		
		return new ResponseEntity<Object>(apiError,apiError.getStatus());
		
	}
	
	protected ResponseEntity<?> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException e){
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
		apiError.setMessage(e.getMessage());
		apiError.setDebugMessage(e.getRequiredType().getName());
		return buildResponseEntity(apiError);
	}
}