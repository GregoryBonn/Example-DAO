package com.example.app.infrastructure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.app.domain.Produit;

public class ProduitDaoImpl implements IProduitDao{

	public void createProduit(Produit produitASaveinBDD) {
		//  a l'ordre a Hibernate d'ecrire en BDD
		System.out.println("Enregistrement en bdd...");
		
		SessionFactory sessionFactory=DaoFactory.getSessionFactory();
		
		//Recupere une Session
		Session session=sessionFactory.openSession();
		//Requete
		session.beginTransaction();
		  session.persist(produitASaveinBDD);
		session.getTransaction().commit();
	}
}
