package com.gasystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.gasystem.entities.User;


public interface UserRepository  extends JpaRepository<User, String> {

	List<User> findByService(Service service);

}
