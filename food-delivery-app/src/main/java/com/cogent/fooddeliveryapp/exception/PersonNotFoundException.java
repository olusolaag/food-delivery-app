/**
 * 
 */
package com.cogent.fooddeliveryapp.exception;

/**
 * @author "Olusola Agboola"
 * @date Feb 15, 2022
 * @time 12:52:47 PM
 */
public class PersonNotFoundException extends Exception {
	
	public PersonNotFoundException(String e) {
		super(e);
	}

	@Override
	public String toString() {
		return super.getMessage();
	}
}
