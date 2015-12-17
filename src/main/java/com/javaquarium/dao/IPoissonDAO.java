package com.javaquarium.dao;

import java.util.List;

import com.javaquarium.beans.data.PoissonDO;

public interface IPoissonDAO {

	void addPoisson(final PoissonDO pDO);

	List<PoissonDO> getPoissons();

}
