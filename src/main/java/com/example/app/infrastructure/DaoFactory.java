package com.example.app.infrastructure;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoFactory {

	
	public static IProduitDao getProduitDao() {
		return new ProduitDaoImpl();
				
	}
	
	public static IClientDao getClientDao() {
		return new ClientDaoImpl();
				
	}
	
	
	public static SessionFactory getSessionFactory() {
		
		//Recuperer ma SessionFactory
		 SessionFactory sessionFactory = null;
		 StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
		}
		catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy( registry );
		}
		return sessionFactory;
	}
}
