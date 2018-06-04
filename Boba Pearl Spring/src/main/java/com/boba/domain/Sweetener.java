package com.boba.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Sweetener {

	private Long id;
	
	private String name;
	
	private Integer amount;
	
	private String description;
	
	@ManyToOne
	private Drink drink;
}
