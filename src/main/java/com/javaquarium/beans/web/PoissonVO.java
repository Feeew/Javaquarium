package com.javaquarium.beans.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * @author Benjamin
 *
 *         Modèle de donnée d'un Poisson côté Client (dimension en un seul
 *         champ)
 */

public class PoissonVO extends ActionForm {
	public static final String SEPARATEUR_DIMENSION = "x";

	private static final long serialVersionUID = -1335965516209871095L;

	private String espece;

	private String description;

	private String couleur;

	private String dimension;

	private String prix;

	/**
	 * Constructeur vite pour struts
	 */
	public PoissonVO() {
		super();
	}

	/**
	 * Constructeur prenant en compte tous les paramètres nécessaires pour
	 * construire un poisson
	 * 
	 * @param espece
	 *            String
	 * @param description
	 *            String
	 * @param couleur
	 *            String
	 * @param dimension
	 *            String
	 * @param prix
	 *            String
	 */
	public PoissonVO(final String espece, final String description, final String couleur, final String dimension,
			final String prix) {
		super();
		this.espece = espece;
		this.description = description;
		this.couleur = couleur;
		this.dimension = dimension;
		this.prix = prix;
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

		// Si la description ne contient pas de X on ne peut rien faire
		if (!dimension.contains(SEPARATEUR_DIMENSION) || dimension.split(SEPARATEUR_DIMENSION).length < 2 || dimension.split(SEPARATEUR_DIMENSION)[0] == null
				|| dimension.split(SEPARATEUR_DIMENSION)[0].isEmpty()) {
			actionErrors.add("dimension", new ActionMessage("error.wrongDimensionFormat"));
		}

		return actionErrors;
	}

	/**
	 * @return the espece
	 */
	public String getEspece() {
		return espece;
	}

	/**
	 * @param espece
	 *            the espece to set
	 */
	public void setEspece(final String espece) {
		this.espece = espece;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur
	 *            the couleur to set
	 */
	public void setCouleur(final String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the dimension
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * @param dimension
	 *            the dimension to set
	 */
	public void setDimension(final String dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the prix
	 */
	public String getPrix() {
		return prix;
	}

	/**
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(final String prix) {
		this.prix = prix;
	}

}
