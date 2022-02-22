/**
 * 
 */
package com.cogent.fooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.cogent.fooddeliveryapp.dto.Food;
import com.cogent.fooddeliveryapp.enums.FoodType;


/**
 * @author "Olusola Agboola"
 * @date Feb 22, 2022
 * @time 9:51:54 AM
 */
public interface FoodService {
	public Food createFood(Food food); //helpful to return the added user id
	public Optional<Food> getFoodById(long id);
	public Optional<Food> findById(long id);
	public List<Food> findAll();
	public List<Food> getAllFoods();
	public String deleteFoodById(long id);
	public Food updateFood(Food food);
	public boolean existsById(long id);
	public List<Food> getAllFoodsAscOrder();
	public List<Food> getAllFoodsDescOrder();
	public List<Food> findAllByFoodType(FoodType foodType);

}
