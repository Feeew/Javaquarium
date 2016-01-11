package com.javaquarium.business;

import java.util.List;

import com.javaquarium.beans.web.PoissonVO;

/**
 * @author Benjamin Interface pour le AquariumService
 */

public interface IAquariumService {
	/**
	 * Fonction de récupération de tous les poissons
	 * 
	 * @return List<PoissonVO>
	 */
	List<String> getPoissons(Integer idUser);
	

	/**
	 * Fonction de vidage de l'aquarium
	 */
	void viderAquarium();
	

	/**
	 * Fonction de sauvegarde de l'aquarium
	 */
	void sauverAquarium(Integer idUser, List<PoissonVO> poissons);

}
