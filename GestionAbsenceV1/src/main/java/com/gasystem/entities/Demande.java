package com.gasystem.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Demande {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idDemande;
    private Date dateSoumis;
    private Date dateDebut;
    private Date dateFin;
    private double nbrJour;
    @Value(value = "pending")
	private String statutDemande;
    
    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

	public Date getDateSoumis() {
		return dateSoumis;
	}

	public void setDateSoumis(Date dateSoumis) {
		this.dateSoumis = dateSoumis;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public double getNbrJour() {
		return nbrJour;
	}

	public void setNbrJour(double nbrJour) {
		this.nbrJour = nbrJour;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Demande() {
		super();
	}



	public Integer getIdDemande() {
		return idDemande;
	}

	public void setIdDemande(Integer idDemande) {
		this.idDemande = idDemande;
	}

	public String getStatutDemande() {
		return statutDemande;
	}

	public void setStatutDemande(String statutDemande) {
		this.statutDemande = statutDemande;
	}

	public Demande(Date dateSoumis, Date dateDebut, Date dateFin, double nbrJour) {
		super();
		this.dateSoumis = dateSoumis;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nbrJour = nbrJour;
	}

    
    
    
    
}
