package com.gasystem.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class DemandeMaladie extends Demande {

	private String attachement;
	private String commentaire;
	
	
	public DemandeMaladie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DemandeMaladie(Date dateSoumis, Date dateDebut, Date dateFin, double nbrJour, User user) {
		super(dateSoumis, dateDebut, dateFin, nbrJour);
	}
	public DemandeMaladie(String attachement, String commentaire) {
		super();
		this.attachement = attachement;
		this.commentaire = commentaire;
	}

	public String getAttachement() {
		return attachement;
	}
	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
}
