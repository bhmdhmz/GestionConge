package com.gasystem.repositories;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gasystem.entities.DemandeConge;
import com.gasystem.entities.User;

public interface DemandeCongeRepository extends JpaRepository<DemandeConge, Integer>{

	List<DemandeConge> findCongeByUser(User user);
	
	@Query(nativeQuery = true, value = "select * from demande d,demande_conge dc where d.id_demande = dc.id_demande and d.user_id = :userId and statut_demande LIKE '%EN ATTENTE%' ORDER BY d.date_soumis desc LIMIT 3")
	List<DemandeConge> findLast3ByUser(@Param("userId") String username);

	
}
