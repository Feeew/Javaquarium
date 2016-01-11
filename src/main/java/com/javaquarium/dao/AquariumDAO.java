package com.javaquarium.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaquarium.beans.data.AquariumDO;
import com.javaquarium.util.HibernateUtils;

public class AquariumDAO implements IAquariumDAO {

	@Override
	public void addPoisson(String especePoisson, Integer idUser) {
		Session s = HibernateUtils.getSession();   
		
		// Début de la transaction 
		Transaction t = s.beginTransaction();   
		
		// Création d'un objet Event 
		AquariumDO a = new AquariumDO(); 
		a.setEspecePoisson(especePoisson);	
		a.setIdUser(idUser);
		
		// Enregistrement de l'event 
		s.save(a);   
		
		// Fin de la transaction 
		t.commit();   
		
		// Fermeture de la session Hibernate 
		s.close(); 
	}

	@Override
	public void viderAquarium() {
		final Session s = HibernateUtils.getSession();
		s.beginTransaction();

		// Création de la requête
		Query q = s.createQuery("delete Aquarium");
		// Exécution de la requête
		q.executeUpdate();

	}

	@Override
	public List<AquariumDO> getAquarium(Integer idUser) {
		// TODO Auto-generated method stub
		return null;
	}

}