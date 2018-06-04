package com.boba.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.boba.domain.Drink;

public interface DrinkRepository extends CrudRepository<Drink, Long>{
	
	Optional<Drink> findByName(String name); 

}
