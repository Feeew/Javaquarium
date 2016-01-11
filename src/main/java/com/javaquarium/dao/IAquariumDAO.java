package com.javaquarium.dao;

import java.util.List;

import com.javaquarium.beans.data.AquariumDO;

public interface IAquariumDAO {

	public void addPoisson(String especePoisson, Integer idUser);

	public void viderAquarium();
	
	public List<AquariumDO> getAquarium(Integer idUser);

}
