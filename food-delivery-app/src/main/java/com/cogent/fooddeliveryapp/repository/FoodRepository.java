/**
 * 
 */
package com.cogent.fooddeliveryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.fooddeliveryapp.dto.Food;
import com.cogent.fooddeliveryapp.enums.FoodType;

/**
 * @author "Olusola Agboola"
 * @date Feb 22, 2022
 * @time 9:47:45 AM
 */
public interface FoodRepository extends JpaRepository<Food, Long> {
	public List<Food> findAllByFoodType(FoodType foodType);

}
