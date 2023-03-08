package com.inti.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Vol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVol;
	private LocalDate dateDepart;
	private String heureDepart;
	private LocalDate dateArrivee;
	private String heureArrivee;
	
	@ManyToMany
	@JoinTable(name="CompAer_Vol",
	joinColumns = @JoinColumn(name="idVol"),
	inverseJoinColumns = @JoinColumn(name="idCompAer"))
	private List<CompagnieAerienne> listeCompAer;
	
	@OneToMany(mappedBy = "vol", targetEntity = Reservation.class)
	private List<Reservation> listeReservation;
	
	@ManyToOne
	@JoinColumn(name="idAeroportDepart")
	private Aeroport aeroportDepart;
	
	@ManyToOne
	@JoinColumn(name="idAeroportArrivee")
	private Aeroport aeroportArrivee;
	
	public Vol() {
		super();
	}
	public Vol(LocalDate dateDepart, String heureDepart, LocalDate dateArrivee, String heureArrivee) {
		super();
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.dateArrivee = dateArrivee;
		this.heureArrivee = heureArrivee;
	}
	
	public void ouvrirVol()
	{
		
	}
	
	public void fermerVol()
	{
		
	}
	
	
	public int getIdVol() {
		return idVol;
	}
	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}
	public LocalDate getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}
	public String getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	public LocalDate getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public String getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	
	
	public List<Reservation> getListeReservation() {
		return listeReservation;
	}
	public void setListeReservation(List<Reservation> listeReservation) {
		this.listeReservation = listeReservation;
	}
	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}
	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}
	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}
	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}
	public List<CompagnieAerienne> getListeCompAer() {
		return listeCompAer;
	}
	public void setListeCompAer(List<CompagnieAerienne> listeCompAer) {
		this.listeCompAer = listeCompAer;
	}
	@Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", dateDepart=" + dateDepart + ", heureDepart=" + heureDepart + ", dateArrivee="
				+ dateArrivee + ", heureArrivee=" + heureArrivee + "]";
	}
	
	
}
