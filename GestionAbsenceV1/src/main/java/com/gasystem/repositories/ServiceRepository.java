package com.gasystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasystem.entities.Service;
import com.gasystem.entities.User;


public interface ServiceRepository extends JpaRepository<Service, Long> {

	
}
