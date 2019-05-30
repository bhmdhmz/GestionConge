package com.gasystem.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class DemandeConge extends Demande{

	 private String typeConge;
	 private String commentaire;
	public String getTypeConge() {
		return typeConge;
	}
	public void setTypeConge(String typeConge) {
		this.typeConge = typeConge;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public DemandeConge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DemandeConge(Date dateSoumis, Date dateDebut, Date dateFin, double nbrJour, User user) {
		super(dateSoumis, dateDebut, dateFin, nbrJour);
		// TODO Auto-generated constructor stub
	}
	public DemandeConge(String typeConge, String commentaire) {
		super();
		this.typeConge = typeConge;
		this.commentaire = commentaire;
	}

	 
	 
	 
	
}
