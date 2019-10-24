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
    	PaysDAOImpl pDAO = new PaysDAOImpl();
    	Pays p = new Pays("Cameroun", 274000);
    	
    	pDAO.ajouter(p);
    	
    	
    }
}
