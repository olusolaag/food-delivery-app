/**
 * 
 */
package com.cogent.fooddeliveryapp.payload.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.cogent.fooddeliveryapp.enums.FoodType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author "Olusola Agboola"
 * @date Feb 22, 2022
 * @time 9:30:58 AM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateFoodRequest {
	@NotBlank
	private String foodName;
	@NotBlank
	private String description;
	@NotBlank
	private String foodPic;
	@NotNull
	private Float foodPrice;
	@Enumerated(EnumType.STRING)
	private FoodType foodType;

}
