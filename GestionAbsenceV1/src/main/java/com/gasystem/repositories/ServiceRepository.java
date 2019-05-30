package com.gasystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasystem.entities.Service;


public interface ServiceRepository extends JpaRepository<Service, Long> {

}
