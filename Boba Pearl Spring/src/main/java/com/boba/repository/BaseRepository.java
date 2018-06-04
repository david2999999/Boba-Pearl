package com.boba.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.boba.domain.Base;

public interface BaseRepository extends CrudRepository<Base,Long> {
	
	Optional<Base> findByName(String name);

}
