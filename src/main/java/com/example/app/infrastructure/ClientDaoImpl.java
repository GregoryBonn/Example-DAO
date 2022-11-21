package com.example.app.infrastructure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.app.domain.Client;

public class ClientDaoImpl implements IClientDao{

	public void createClient(Client clientASaveInBdd) {
	//  e l ordre a Hibernate d'ecrire en BDD
			System.out.println("Enregistrement en bdd...");
			
			SessionFactory sessionFactory=DaoFactory.getSessionFactory();
			
			//Recupere une Session
			Session session=sessionFactory.openSession();
			//Requete
			session.beginTransaction();
			  session.persist(clientASaveInBdd);
			session.getTransaction().commit();
		
	}

}
