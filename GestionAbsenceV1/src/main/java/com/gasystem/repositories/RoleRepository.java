package com.gasystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasystem.entities.RoleUser;

public interface RoleRepository extends JpaRepository<RoleUser, String> {

}
