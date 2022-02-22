/**
 * 
 */
package com.cogent.fooddeliveryapp.payload.response;

import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.cogent.fooddeliveryapp.payload.request.AddressRequest;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author "Olusola Agboola"
 * @date Feb 21, 2022
 * @time 3:27:31 PM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
	@NotBlank
	private String email;
	@NotBlank
	private String name;
	//@NotEmpty
	private Set<AddressRequest> addresses;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate doj;
	@NotEmpty
	private Set<String> roles;

}
