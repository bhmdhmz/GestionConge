package com.gasystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.gasystem.entities.User;


public interface UserRepository  extends JpaRepository<User, String> {

	List<User> findByService(Service service);
	
	@Query (nativeQuery = true, value = "select nom_profil as name , prenom_profil as id From User")
	public List<User> findAllForCalendar();

	
}
