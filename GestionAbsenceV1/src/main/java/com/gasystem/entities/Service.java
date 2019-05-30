package com.gasystem.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Service {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idService;
	private String nom;
	@OneToMany(mappedBy="service")
    private List<User> users;
	
	
	public Long getIdService() {
		return idService;
	}
	@Override
	public String toString() {
		return "Service [nom=" + nom + "]";
	}
	public void setIdService(Long idService) {
		this.idService = idService;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Service( String nom) {

		this.nom = nom;
	}
	public Service() {
		super();
	}
	
	
	
}
