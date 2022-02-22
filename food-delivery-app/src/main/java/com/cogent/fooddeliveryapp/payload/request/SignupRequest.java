/**
 * 
 */
package com.cogent.fooddeliveryapp.payload.request;

import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author "Olusola Agboola"
 * @date Feb 18, 2022
 * @time 2:39:29 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
	@NotBlank
	private String email;
	@NotBlank
	private String password;
	@NotBlank
	private String name;
	@NotEmpty
	private Set<AddressRequest> addresses;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate doj;
	@NotEmpty
	private Set<String> roles;
}
