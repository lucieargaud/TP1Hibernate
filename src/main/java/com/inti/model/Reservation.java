package com.inti.model;

import java.time.LocalDate;

public class Reservation {

	private int idReservation;
	private LocalDate date;
	private int numero;
	
	public Reservation() {
		super();
	}
	public Reservation(LocalDate date, int numero) {
		super();
		this.date = date;
		this.numero = numero;
	}
	
	public void annuler()
	{
		
	}
	
	public void confirmer()
	{
		
	}
	
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", date=" + date + ", numero=" + numero + "]";
	}
	
	
	
}
