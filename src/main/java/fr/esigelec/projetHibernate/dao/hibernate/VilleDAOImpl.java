package fr.esigelec.projetHibernate.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import fr.esigelec.projetHibernate.dto.Ville;
import fr.esigelec.projetHibernate.dao.IVilleDAO;
import fr.esigelec.projetHibernate.dao.hibernate.HibernateUtil;

public class VilleDAOImpl implements IVilleDAO{

	public void ajouter(Ville v) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(v);
		session.getTransaction().commit();
		session.close();
	}

	public Ville getVille(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Ville retour=(Ville)session.get(Ville.class, id);
		session.getTransaction().commit();
		session.close();
		return retour;
	}

	public List<Ville> getVilles() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query<Ville> q=session.createQuery("from Ville"); //requete HQL
		List<Ville> retour=q.getResultList();
		session.getTransaction().commit();
		session.close();
		return retour; 
	}

	public void update(Ville v) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(v);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Ville v) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(v);
		session.getTransaction().commit();
		session.close();
	}

	public void refresh(Ville v) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.refresh(v);
		session.getTransaction().commit();
		session.close();
	}

}
