/**
 * 
 */
package com.cogent.fooddeliveryapp.dto;

import javax.persistence.GeneratedValue;

/**
 * @author "Olusola Agboola"
 * @date Feb 22, 2022
 * @time 9:32:01 AM
 */
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.cogent.fooddeliveryapp.enums.FoodType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String foodName;
	private String description;
	private String foodPic;
	private Float foodPrice;
	@Enumerated(EnumType.STRING)
	private FoodType foodType;

}
