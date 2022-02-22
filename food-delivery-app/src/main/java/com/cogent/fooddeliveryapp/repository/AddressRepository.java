/**
 * 
 */
package com.cogent.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.fooddeliveryapp.dto.Address;

/**
 * @author "Olusola Agboola"
 * @date Feb 18, 2022
 * @time 3:44:04 PM
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
