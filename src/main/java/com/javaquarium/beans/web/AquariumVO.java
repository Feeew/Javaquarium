package com.javaquarium.beans.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * @author Benjamin
 *
 *         Modèle de donnée d'un Aquarium côté Client
 *         Contient la liste des poissons présents
 */

public class AquariumVO extends ActionForm {
	private static final long serialVersionUID = -1335965516209871095L;

	private List<String> mesEspecesPoissons;

	/**
	 * Constructeur vite pour struts
	 */
	public AquariumVO() {
		super();
	}

	/**
	 * Constructeur prenant en compte tous les paramètres nécessaires pour
	 * construire un aquarium
	 * 
	 * @param idsPoisson
	 *            List<Integer>
	 */
	public AquariumVO(final List<String> mesEspecesPoissons) {
		super();
		this.mesEspecesPoissons = mesEspecesPoissons;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.struts.action.ActionForm#validate(org.apache.struts.action.
	 * ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public ActionErrors validate(final ActionMapping mapping, final HttpServletRequest request) {
		final ActionErrors actionErrors = new ActionErrors();

		return actionErrors;
	}

	/**
	 * @return the idPoisson
	 */
	public List<String> getEspecesPoissons() {
		return mesEspecesPoissons;
	}

	/**
	 * @param mesPoissons Liste des poissons à ajouter
	 */
	public void setPoissons(final List<String> mesEspecesPoissons) {
		this.mesEspecesPoissons = mesEspecesPoissons;
	}


}
