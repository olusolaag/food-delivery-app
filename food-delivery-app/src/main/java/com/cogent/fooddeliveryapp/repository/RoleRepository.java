/**
 * 
 */
package com.cogent.fooddeliveryapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.fooddeliveryapp.dto.Role;
import com.cogent.fooddeliveryapp.enums.ERole;

/**
 * @author "Olusola Agboola"
 * @date Feb 18, 2022
 * @time 4:17:58 PM
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByRoleName(ERole roleName);

}
