package com.orgnisation.service.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.orgnisation.service.model.CustomException;
import com.orgnisation.service.model.CustomResponseEntity;

/**
 * @author Rafeeq Ali Shaik
 *
 */
/**
 * The Class RestExceptionHandler.
 */
@ControllerAdvice
public class RestExceptionHandler {

    /**
     * Custom exception.
     *
     * @param customeException
     *            the custome exception
     * @return the response entity
     */
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomResponseEntity> customException(CustomException customeException) {

	CustomResponseEntity cre = new CustomResponseEntity();
	cre.setMessage(customeException.getMessage());
	cre.setStatus(customeException.getStatus().value());
	cre.setTimestamp(customeException.getTimestamp());
	cre.setPath(customeException.getPath());

	return new ResponseEntity<CustomResponseEntity>(cre, customeException.getStatus());

    }

}
