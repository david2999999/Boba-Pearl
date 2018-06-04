package com.boba.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
public class Drink {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String description;
	
	@OneToOne
	private Base base;
	
	@Enumerated(value = EnumType.STRING)
	private Size size;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "drink")
	private Set<Topping> toppings;
	
}
