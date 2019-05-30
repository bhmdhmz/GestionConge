package com.gasystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasystem.entities.RoleUser;
import com.gasystem.entities.User;
import com.gasystem.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userReprository;
	
	public void createResponsable(User user)
	{
		RoleUser role= new RoleUser("RESPONSABLE");
		List<RoleUser> roles = new ArrayList<>();
		roles.add(role);
		user.setRoles(roles);
		userReprository.save(user);
		
	}
	
	public void createAgent(User user)
	{
		RoleUser role= new RoleUser("AGENT");
		List<RoleUser> roles = new ArrayList<>();
		roles.add(role);
		user.setRoles(roles);
		userReprository.save(user);
		
	}
	
	public void createRH(User user)
	{
		RoleUser role= new RoleUser("RH");
		List<RoleUser> roles = new ArrayList<>();
		roles.add(role);
		user.setRoles(roles);
		userReprository.save(user);
	}
	
	
	public User findUser(Integer idUser)
	{
		return userReprository.findOne(idUser);
	}
	
	
	public List<User> findByService(Service service) {
		
		return userReprository.findByService(service);

	}
	
	public List<User> findAllUser()
	{
		return userReprository.findAll();
	}
	
}
