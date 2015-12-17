package com.javaquarium.business;

import java.util.List;

import com.javaquarium.beans.web.PoissonVO;

/**
 * @author Benjamin Interface pour le PoissonService
 */

public interface IPoissonService {
	/**
	 * Fonction d'ajout d'un poisson
	 * 
	 * @param poisson
	 *            PoissonVO
	 */
	void ajouterPoisson(final PoissonVO poisson);

	/**
	 * Fonction de suppression d'un poisson
	 * 
	 * @param poisson
	 *            PoissonVO
	 */
	void supprimerPoisson(final PoissonVO poisson);

	/**
	 * Fonction de récupération de tous les poissons
	 * 
	 * @return List<PoissonVO>
	 */
	List<PoissonVO> getPoissons();

	/**
	 * Fonction d'ajout d'un poisson
	 * 
	 * @param poisson
	 *            PoissonVO
	 */
	void addPoisson(final PoissonVO poisson);
}
