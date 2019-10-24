/**
 * 
 */
package fr.esigelec.projetHibernate.dto;

/**
 * @author 12455341
 *
 */
public class Ville {
	private int id;
	private int id_pays;	
	private String nom;
	private int nb_habitants;

	public Ville() {
		
	}
	
	public Ville(String nom, int nb_habitants) {
		this.nom = nom;
		this.nb_habitants = nb_habitants ;
	}
	
	public int getId() {
		return id;
	}
	public int getIdPays() {
		return id_pays;
	}
	public String getNom() {
		return nom;
	}
	public int getNbHabitants() {
		return nb_habitants;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setIdPays(int id_pays) {
		this.id_pays = id_pays;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNbHabitants(int nb_habitants) {
		this.nb_habitants = nb_habitants;
	}
	
	public String toString() {
		return "Ville (id: "+id+", id_pays: "+id_pays+", nom : "+nom+", Habitants: "+nb_habitants+")";
	}

}
