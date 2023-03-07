package com.inti.model;

public class InfosEscale {
	
	private int idEscale;
	private String heureArrivee;
	private String heureDepart;
	
	public InfosEscale() {
		super();
	}

	public InfosEscale(String heureArrivee, String heureDepart) {
		super();
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
	}

	public int getIdEscale() {
		return idEscale;
	}

	public void setIdEscale(int idEscale) {
		this.idEscale = idEscale;
	}

	public String getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}

	@Override
	public String toString() {
		return "InfosEscale [idEscale=" + idEscale + ", heureArrivee=" + heureArrivee + ", heureDepart=" + heureDepart
				+ "]";
	}
	

}
