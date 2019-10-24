package fr.esigelec.projetHibernate.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import fr.esigelec.projetHibernate.dao.IPaysDAO;
import fr.esigelec.projetHibernate.dto.Pays;
import fr.esigelec.projetHibernate.dto.Ville;

public class PaysDAOImpl implements IPaysDAO {

	public void ajouter(Pays p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
	}

	public Pays getPays(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Pays retour=(Pays)session.get(Pays.class, id);
		session.getTransaction().commit();
		session.close();
		return retour;
	}

	public List<Pays> getPays() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query<Pays> q=session.createQuery("from Pays"); //requete HQL
		List<Pays> retour=q.getResultList();
		session.getTransaction().commit();
		session.close();
		return retour; 
	}

	public Pays getPays(String nomPays) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from Personne where nom=:nomPays";
		Query<Pays> q = session.createQuery(hql);
		q.setParameter("nomPays", nomPays);
		Pays retour= q.getSingleResult();
		session.getTransaction().commit();
		session.close();
		return retour;
	}

	public void update(Pays p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Pays p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();
		session.close();
	}

	public void refresh(Pays p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.refresh(p);
		session.getTransaction().commit();
		session.close();
	}

}
