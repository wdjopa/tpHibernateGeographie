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
	private Pays pays;	
	private String nom;
	private int nbHabitants;

	public Ville() {
		
	}
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants ;
	}
	
	public int getId() {
		return id;
	}
	public Pays getPays() {
		return pays;
	}
	public String getNom() {
		return nom;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	public String toString() {
		return "Ville (id: "+id+", Pays: "+pays.toString()+", nom : "+nom+", Habitants: "+nbHabitants+"Millions d'habitants)";
	}

}
