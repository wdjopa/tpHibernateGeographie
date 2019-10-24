package fr.esigelec.projetHibernate;

import fr.esigelec.projetHibernate.dto.*;
import fr.esigelec.projetHibernate.dao.hibernate.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	VilleDAOImpl vDAO = new VilleDAOImpl();
    	PaysDAOImpl pDAO = new PaysDAOImpl();
    	Pays p = new Pays("Cameroun", 274000);
    	Ville v = new Ville("Yaoundé", 25, p);
    	Ville v2 = new Ville("Douala", 5, p);

    	vDAO.ajouter(v2);
    	vDAO.delete(v);
    	
    }
}
