package com.javaquarium.business;

import java.util.ArrayList;
import java.util.List;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.dao.IPoissonDAO;
import com.javaquarium.dao.PoissonDAO;

/**
 * 
 * @author Benjamin Service permettant de faire le lien entre la partie Client
 *         (VO) et la partie BDD (DO) en traitant notamment les dimensions
 *
 */
public class PoissonService implements IPoissonService {
	@Override
	public void ajouterPoisson(final PoissonVO poisson) {
	}

	@Override
	public void supprimerPoisson(final PoissonVO poisson) {
	}

	@Override
	public List<PoissonVO> getPoissons() {
		final IPoissonDAO poissonDAO = new PoissonDAO();
		final List<PoissonDO> poissonsDO = poissonDAO.getPoissons();

		final List<PoissonVO> poissonsVO = new ArrayList<PoissonVO>();

		for (PoissonDO pDO : poissonsDO) {
			final String dimension = pDO.getLongueur() + PoissonVO.SEPARATEUR_DIMENSION + pDO.getLargeur();
			final PoissonVO monPoisson = new PoissonVO(pDO.getEspece(), pDO.getDescription(), pDO.getCouleur(), dimension,
					pDO.getPrix());
			poissonsVO.add(monPoisson);
		}

		return poissonsVO;
	}

	@Override
	public void addPoisson(final PoissonVO pVO) {
		final String longueur = pVO.getDimension().split(PoissonVO.SEPARATEUR_DIMENSION)[0];
		final String largeur = pVO.getDimension().split(PoissonVO.SEPARATEUR_DIMENSION)[1];
		final PoissonDO pDO = new PoissonDO(0, pVO.getEspece(), pVO.getDescription(), pVO.getCouleur(), longueur, largeur,
				pVO.getPrix());

		final IPoissonDAO pDAO = new PoissonDAO();
		pDAO.addPoisson(pDO);
	}
}