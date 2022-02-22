/**
 * 
 */
package com.cogent.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.fooddeliveryapp.dto.User;

/**
 * @author "Olusola Agboola"
 * @date Feb 18, 2022
 * @time 3:43:00 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
