package fr.esigelec.projetHibernate.dao.hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		// La SessionFactory est initialisée une seule fois pour toute l'application!
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		// configuration à partir du fichier hibernate.cfg.xml
		try {
			sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
		}
		catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy( registry );
		}
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}