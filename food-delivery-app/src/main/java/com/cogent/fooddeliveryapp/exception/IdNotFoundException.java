/**
 * 
 */
package com.cogent.fooddeliveryapp.exception;



/**
 * @author "Olusola Agboola"
 * @date Feb 21, 2022
 * @time 10:24:36 AM
 */
public class IdNotFoundException extends RuntimeException{
	public IdNotFoundException(String msg) {
		super(msg);
	}

	@Override
	public String toString() {
		return super.getMessage();
	}
	
	

}
