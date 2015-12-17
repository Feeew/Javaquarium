package com.javaquarium.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.util.HibernateUtils;

/**
 * 
 * @author Benjamin
 *
 */
public class PoissonDAO implements IPoissonDAO{
	/**
	 * Constructeur vide
	 */
	public PoissonDAO() {
		super();
	}

	/**
	 * Fonction de récupération des poissons
	 * 
	 * @return List<PoissonVO>
	 */
	@Override
	public List<PoissonDO> getPoissons() {
		final Session s = HibernateUtils.getSession();
		s.beginTransaction();

		final Query q = s.createQuery("from PoissonDO");

		@SuppressWarnings("unchecked")
		final List<PoissonDO> poissons = (ArrayList<PoissonDO>) q.list();

		return poissons;
	}

	/**
	 * Fonction d'ajout d'un poisson
	 * 
	 * @param pDO
	 *            PoissonDO
	 */
	@Override
	public void addPoisson(final PoissonDO pDO) {
		final Session s = HibernateUtils.getSession();
		final Transaction t = s.beginTransaction();

		s.save(pDO);

		t.commit();

		s.close();
	}
}
