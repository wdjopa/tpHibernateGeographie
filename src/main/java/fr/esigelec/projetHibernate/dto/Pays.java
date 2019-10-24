package fr.esigelec.projetHibernate.dto;

public class Pays {
	private int id;
	private String nom;
	private float superficie;

	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public float getSuperficie() {
		return superficie;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
}
