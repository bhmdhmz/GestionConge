package com.gasystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gasystem.entities.DemandeConge;
import com.gasystem.entities.User;
import com.gasystem.repositories.DemandeCongeRepository;

@Service
public class DCongeService {
	
	@Autowired
	private DemandeCongeRepository congeRepository ;
	
	public void createConge(DemandeConge demande)
	{
		congeRepository.save(demande);
	}

	public Page<DemandeConge> findCongesByUser(User user, Pageable pageable)
	{
		return congeRepository.findCongeByUser(user, pageable);
	}
	
	public  List<DemandeConge> findTop3ByUser(User user)
	{
		return congeRepository.findLast3ByUser(user.getUsername());
	}
	
	
}