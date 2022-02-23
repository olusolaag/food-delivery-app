/**
 * 
 */
package com.cogent.fooddeliveryapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.fooddeliveryapp.dto.Food;
import com.cogent.fooddeliveryapp.enums.FoodType;
import com.cogent.fooddeliveryapp.repository.FoodRepository;
import com.cogent.fooddeliveryapp.service.FoodService;

/**
 * @author "Olusola Agboola"
 * @date Feb 22, 2022
 * @time 9:57:13 AM
 */
@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	FoodRepository foodRepository;

	@Override
	public Food createFood(Food food) {
		// TODO Auto-generated method stub
		return foodRepository.save(food);
	}

	@Override
	public Optional<Food> getFoodById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> getAllFoods() {
		// TODO Auto-generated method stub
		return foodRepository.findAll();
	}

	@Override
	public String deleteFoodById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food updateFood(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Food> getAllFoodsAscOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> getAllFoodsDescOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Food> findById(long id) {
		// TODO Auto-generated method stub
		return foodRepository.findById(id);
	}

	@Override
	public List<Food> findAll() {
		// TODO Auto-generated method stub
		return foodRepository.findAll();
	}

	@Override
	public List<Food> findAllByFoodType(FoodType foodType){
		// TODO Auto-generated method stub
		return foodRepository.findAllByFoodType(foodType);
	}

}
