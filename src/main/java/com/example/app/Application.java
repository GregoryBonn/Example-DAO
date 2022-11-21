package com.example.app;

import com.example.app.domain.Produit;
import com.example.app.infrastructure.DaoFactory;
import com.example.app.infrastructure.IClientDao;
import com.example.app.infrastructure.IProduitDao;
import com.example.app.infrastructure.ProduitDaoImpl;

public class Application {

	public static void main(String[] args) {
		
		Produit p=new Produit();
		p.setName("microphone");
		//Recuperation implementation
		
		IProduitDao dao=DaoFactory.getProduitDao();  //IProduitDao dao=new ProduitDaoImpl();
		//Ecriture en BDD
		dao.createProduit(p);
		
		
	}

}
