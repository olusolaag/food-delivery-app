/**
 * 
 */
package com.cogent.fooddeliveryapp.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author "Olusola Agboola"
 * @date Feb 18, 2022
 * @time 2:40:36 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {
	@NotNull
	private Integer houseNumber;
	@NotBlank
	private String street;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@NotBlank
	private String country;
	@NotNull
	private long zip;
	

}
