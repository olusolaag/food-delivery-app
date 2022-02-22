/**
 * 
 */
package com.cogent.fooddeliveryapp.exception;

/**
 * @author "Olusola Agboola"
 * @date Feb 21, 2022
 * @time 4:28:01 PM
 */
public class NoDataFoundException extends RuntimeException{
	public NoDataFoundException(String msg) {
		super(msg);
	}
	
	public String toString() {
		return super.getMessage();
	}

}
