package com.javaquarium.business;

import java.util.ArrayList;
import java.util.List;

import com.javaquarium.beans.data.AquariumDO;
import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.dao.AquariumDAO;
import com.javaquarium.dao.IAquariumDAO;

/**
 * 
 * @author Benjamin Service permettant de faire le lien entre la partie Client
 *         (VO) et la partie BDD (DO)
 *
 */
public class AquariumService implements IAquariumService {
	

	
	@Override
	public List<String> getPoissons(final Integer idUser) {
		final IAquariumDAO aDAO = new AquariumDAO();
		final List<AquariumDO> LaDO = aDAO.getAquarium(idUser);

		final List<String> mesPoissons = new ArrayList<String>();
		
		for(AquariumDO aDO : LaDO){
			mesPoissons.add(aDO.getEspecePoisson());
		}

		return mesPoissons;
	}

	@Override
	public void viderAquarium() {
		final IAquariumDAO aDAO = new AquariumDAO();
		aDAO.viderAquarium();
	}

	@Override
	public void sauverAquarium(final Integer idUser, final List<PoissonVO> poissonsVO) {
		// TODO Auto-generated method stub
		final IAquariumDAO aDAO = new AquariumDAO();
		for (PoissonVO pVO : poissonsVO) {
			aDAO.addPoisson(pVO.getEspece(), idUser);
		}
	}

}