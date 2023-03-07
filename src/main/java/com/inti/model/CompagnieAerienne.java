package com.inti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class CompagnieAerienne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompAer;
	private String nom;
	
	@ManyToMany
	@JoinTable(name="CompAer_Vol",
	joinColumns = @JoinColumn(name="idCompAer"),
	inverseJoinColumns = @JoinColumn(name="idVol"))
	private List<Vol> listeVol;
	
	public CompagnieAerienne() {
		super();
	}
	
	public CompagnieAerienne(String nom) {
		super();
		this.nom = nom;
	}
	
	public int getIdCompAer() {
		return idCompAer;
	}
	public void setIdCompAer(int idCompAer) {
		this.idCompAer = idCompAer;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public List<Vol> getListeVol() {
		return listeVol;
	}

	public void setListeVol(List<Vol> listeVol) {
		this.listeVol = listeVol;
	}

	@Override
	public String toString() {
		return "CompagnieAerienne [idCompAer=" + idCompAer + ", nom=" + nom + "]";
	}
	
	
}
