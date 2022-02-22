/**
 * 
 */
package com.cogent.fooddeliveryapp.dto;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author "Olusola Agboola"
 * @date Feb 18, 2022
 * @time 2:49:20 PM
 */
@Setter
@Getter
@EqualsAndHashCode(exclude =  {"addresses","roles"})
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString(exclude = {"addresses","roles"}) //printing user will not include address details
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class User {
	//validation already done during signup
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String email;
	
	private String password;
	
	private String name;
//	@Temporal(TemporalType.DATE) // must be specified for persistent fields or properties of type java.util.Date and java.util.Calendar
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate doj = LocalDate.now();
	
	//the mapping is held at the parent class
	@JsonIgnore
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Address> addresses;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="user_roles", joinColumns = @JoinColumn(name="user_id"),
	inverseJoinColumns = @JoinColumn(name="id"))
	private Set<Role> roles;

}
