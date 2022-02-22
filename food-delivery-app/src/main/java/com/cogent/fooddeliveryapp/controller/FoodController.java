/**
 * 
 */
package com.cogent.fooddeliveryapp.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.fooddeliveryapp.dto.Food;
import com.cogent.fooddeliveryapp.enums.FoodType;
import com.cogent.fooddeliveryapp.exception.NoDataFoundException;
import com.cogent.fooddeliveryapp.payload.request.CreateFoodRequest;
import com.cogent.fooddeliveryapp.service.FoodService;

/**
 * @author "Olusola Agboola"
 * @date Feb 22, 2022
 * @time 9:23:41 AM
 */
@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	FoodService foodService;
	@PostMapping(value = "/")
	public ResponseEntity<?> createFood(@Valid @RequestBody CreateFoodRequest createFoodRequest){
		Food food = new Food();
		food.setFoodName(createFoodRequest.getFoodName());
		food.setFoodType(createFoodRequest.getFoodType());
		food.setDescription(createFoodRequest.getDescription());
		food.setFoodPic(createFoodRequest.getFoodPic());
		food.setFoodPrice(createFoodRequest.getFoodPrice());
		Food food2 = foodService.createFood(food);
		return ResponseEntity.status(201).body(food2);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<?> getFoodById(@PathVariable("id")long id) throws NoDataFoundException{
		Optional<Food> food = foodService.getFoodById(id);
		if(food.isPresent()) {
			
			return ResponseEntity.ok(food);
		}else {
			throw new NoDataFoundException("food not present");
		}
		
	}
	
	@GetMapping(value="foods/")
	public ResponseEntity<?> getAllFoods() throws NoDataFoundException{
		List<Food> foods = foodService.getAllFoods();
		if(foods.size()>0) {
			return ResponseEntity.ok(foods);
		}else {
			Map<String, Object> map = new HashMap<>();
			map.put("message", "Sorry food not found");
			return ResponseEntity.status(404).body(map);
		}
		
	}
	
	@GetMapping(value="foods/{foodType}")
	public ResponseEntity<?> getAllFoodsByFoodType(@PathVariable("foodType") String foodType){
		List<Food> foods = foodService.findAllByFoodType(FoodType.valueOf(foodType));
		if(foods.size()>0) {
			return ResponseEntity.ok(foods);
		}else {
			Map<String, Object> map = new HashMap<>();
			map.put("message", "Sorry Food Type Not Found");
			return ResponseEntity.status(404).body(map);
		}
	}
	
	@GetMapping(value = "/all/asc")
	public ResponseEntity<?> getAllAscOrder(){
		List<Food> list = foodService.findAll();
		
		Collections.sort(list, (a,b)->a.getId().compareTo(b.getId()));
		return ResponseEntity.status(200).body(list);
	}
	
	@GetMapping(value = "/all/desc")
	public ResponseEntity<?> getAllDescOrder(){
		List<Food> list = foodService.findAll();
		
		Collections.sort(list, (a,b)->b.getId().compareTo(a.getId()));
		return ResponseEntity.status(200).body(list);
	}

}
