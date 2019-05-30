package com.gasystem.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class RoleUser {


	@Id
	private String roleName;
	@ManyToMany(mappedBy = "roles")
	private List<User> users;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public RoleUser(String roleName) {
		super();
		this.roleName = roleName;
	}
	public RoleUser() {
		super();
	}
	
	@Override
	public String toString() {
		return "RoleUser [roleName=" + roleName + "]";
	}
	
}
