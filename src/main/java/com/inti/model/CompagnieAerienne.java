package com.inti.model;

public class CompagnieAerienne {

	private int idCompAer;
	private String nom;
	
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
	@Override
	public String toString() {
		return "CompagnieAerienne [idCompAer=" + idCompAer + ", nom=" + nom + "]";
	}
	
	
}
