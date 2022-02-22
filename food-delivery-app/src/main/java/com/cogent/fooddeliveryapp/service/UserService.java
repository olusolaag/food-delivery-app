/**
 * 
 */
package com.cogent.fooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.cogent.fooddeliveryapp.dto.User;

/**
 * @author "Olusola Agboola"
 * @date Feb 18, 2022
 * @time 3:46:22 PM
 */
public interface UserService {
	public User addUser(User user); //helpful to return the added user id
	public Optional<User> getUserById(long id);
	public List<User> getAllUsers();
	public String deleteUserById(long id);
	public User updateUser(User user);
	public boolean existsById(long id);
	public List<User> getAllUsersAscOrder();
	public List<User> getAllUsersDescOrder();
}
