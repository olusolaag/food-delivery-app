/**
 * 
 */
package com.cogent.fooddeliveryapp.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;

import com.cogent.fooddeliveryapp.enums.ERole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author "Olusola Agboola"
 * @date Feb 18, 2022
 * @time 4:04:19 PM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	@Enumerated(EnumType.STRING)
	private ERole roleName;

	public ERole getRoleName() {
		return roleName;
	}
	public void setRoleName(ERole roleName) {
		this.roleName = roleName;
	}

	public long getId() {
		return id;
	}
	
}
