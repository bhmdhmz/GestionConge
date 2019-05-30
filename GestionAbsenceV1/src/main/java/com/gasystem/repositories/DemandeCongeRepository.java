package com.gasystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasystem.entities.DemandeConge;
import com.gasystem.entities.User;

public interface DemandeCongeRepository extends JpaRepository<DemandeConge, Integer>{

	List<DemandeConge> findCongeByUser(User user);

}
