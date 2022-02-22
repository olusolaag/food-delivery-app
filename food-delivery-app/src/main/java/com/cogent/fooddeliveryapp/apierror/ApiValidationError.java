/**
 * 
 */
package com.cogent.fooddeliveryapp.apierror;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author "Olusola Agboola"
 * @date Feb 16, 2022
 * @time 10:19:21 AM
 */
@Data
@EqualsAndHashCode(callSuper = false)// it will not call super.hashcode/super.equals
@AllArgsConstructor
public class ApiValidationError extends ApiSubError {
	private String object;
	private String field;
	private Object rejectedValue;
	private String message;
	public ApiValidationError(String object, String message) {
		// TODO Auto-generated constructor stub
		this.object = object;
		this.message = message;
	}
}
