package com.gasystem.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Size;

@Entity
public class User{

	@Id
	@Column(unique = true)
	private String username;
	
	@Size(min=8)
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="USER_ROLES",joinColumns = {
	@JoinColumn(name="USER_USERNAME",referencedColumnName = "username")},
	inverseJoinColumns = {@JoinColumn(name="ROLE_NAME",referencedColumnName = "roleName")})
	private List<RoleUser> roles;
	
	@ManyToOne
    @JoinColumn(name="idService")
    private Service service;
	
	@OneToMany(mappedBy="user")
    private List<Demande> Demande;
	
	
	// DETAIL USER
	
	@Column(name="nom_Profil")
    private String nomProfil;
    @Column(name="prenom_Profil")
    private String prenomProfil;
    @Column(name="adresse_Profil")
    private String adresseProfil;
    @Column(name="tel_Profil")
    private String telProfil;
    @Column(name="email_Profil")
    private String emailProfil;
    @Column(name="lieu_Naissance")
    private String lieuNaissance;
    @Column(name="date_Naissance")
    private Date dateNaissance;
    @Column(name="date_Recrutement")
    private Date dateRecrutement;
    @Column(name="civilite_Profil")
    private String civiliteProfil;
    @Column(name="solde_Profil")
    private double soldeProfil;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<RoleUser> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleUser> roles) {
		this.roles = roles;
	}

	public Service getService() {
		return service;
	}
    
    

	public String getNomProfil() {
		return nomProfil;
	}



	public User(String username, String password, String nomProfil, String prenomProfil, String adresseProfil,
			String telProfil, String emailProfil, String lieuNaissance, Date dateNaissance, Date dateRecrutement,
			String civiliteProfil, double soldeProfil) {
		this.username = username;
		this.password = password;
		this.nomProfil = nomProfil;
		this.prenomProfil = prenomProfil;
		this.adresseProfil = adresseProfil;
		this.telProfil = telProfil;
		this.emailProfil = emailProfil;
		this.lieuNaissance = lieuNaissance;
		this.dateNaissance = dateNaissance;
		this.dateRecrutement = dateRecrutement;
		this.civiliteProfil = civiliteProfil;
		this.soldeProfil = soldeProfil;
	}

	public void setNomProfil(String nomProfil) {
		this.nomProfil = nomProfil;
	}



	public String getPrenomProfil() {
		return prenomProfil;
	}



	public void setPrenomProfil(String prenomProfil) {
		this.prenomProfil = prenomProfil;
	}



	public String getAdresseProfil() {
		return adresseProfil;
	}



	public void setAdresseProfil(String adresseProfil) {
		this.adresseProfil = adresseProfil;
	}



	public String getTelProfil() {
		return telProfil;
	}



	public void setTelProfil(String telProfil) {
		this.telProfil = telProfil;
	}



	public String getEmailProfil() {
		return emailProfil;
	}



	public void setEmailProfil(String emailProfil) {
		this.emailProfil = emailProfil;
	}



	public String getLieuNaissance() {
		return lieuNaissance;
	}



	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}



	public Date getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public Date getDateRecrutement() {
		return dateRecrutement;
	}



	public void setDateRecrutement(Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}



	public String getCiviliteProfil() {
		return civiliteProfil;
	}



	public void setCiviliteProfil(String civiliteProfil) {
		this.civiliteProfil = civiliteProfil;
	}



	public double getSoldeProfil() {
		return soldeProfil;
	}



	public void setSoldeProfil(double soldeProfil) {
		this.soldeProfil = soldeProfil;
	}



	public void setService(Service service) {
		this.service = service;
	}

	public List<Demande> getDemande() {
		return Demande;
	}

	public void setDemande(List<Demande> demande) {
		Demande = demande;
	}



	public User() {
		super();
	}









	
	
	
}
