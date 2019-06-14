package com.gasystem.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.gasystem.entities.Service;
import com.gasystem.entities.User;
import com.gasystem.repositories.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceService {
	
	@Autowired
	public ServiceRepository serviceRepository;

	public void createService(Service service) {
		serviceRepository.save(service);
	}
	
	public Service findService(long idservice)
	{
		return serviceRepository.findOne(idservice);
	}

	
}
