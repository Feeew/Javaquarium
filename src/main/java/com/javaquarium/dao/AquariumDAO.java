package com.javaquarium.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaquarium.beans.data.AquariumDO;
import com.javaquarium.util.HibernateUtils;

public class AquariumDAO implements IAquariumDAO {

	@Override
	public void addPoisson(final String especePoisson, final Integer idUser) {
		final Session s = HibernateUtils.getSession();   
		
		// D�but de la transaction 
		final Transaction t = s.beginTransaction();   
		
		// Cr�ation d'un objet Event 
		final AquariumDO a = new AquariumDO(); 
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

		// Cr�ation de la requ�te
		final Query q = s.createQuery("delete Aquarium");
		// Ex�cution de la requ�te
		q.executeUpdate();

	}

	@Override
	public List<AquariumDO> getAquarium(final Integer idUser) {
		// TODO Auto-generated method stub
		return null;
	}

}