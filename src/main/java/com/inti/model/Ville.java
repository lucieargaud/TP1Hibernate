package com.inti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVille;
	private String nom;
	
	@OneToMany(mappedBy = "ville", targetEntity = Aeroport.class)
	private List<Aeroport> listeAeroport;
	
	public Ville() {
		super();
	}

	public Ville(String nom) {
		super();
		this.nom = nom;
	}

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public List<Aeroport> getListeAeroport() {
		return listeAeroport;
	}

	public void setListeAeroport(List<Aeroport> listeAeroport) {
		this.listeAeroport = listeAeroport;
	}

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", nom=" + nom + "]";
	}
	
	
}
