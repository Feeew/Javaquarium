package com.javaquarium.beans.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Benjamin
 *
 */
@Entity
@Table(name = "c_poissons")
public class PoissonDO {
	private static final long serialVersionUID = -1335965516209871095L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "c_code")
	private Integer code;

	@Column(name = "c_espece")
	private String espece;

	@Column(name = "c_description")
	private String description;

	@Column(name = "c_couleur")
	private String couleur;

	@Column(name = "c_longueur")
	private String longueur;

	@Column(name = "c_largeur")
	private String largeur;

	@Column(name = "c_prix")
	private String prix;

	/**
	 * Constructeur sans paramètre qui appelle le constructeur parent
	 */
	public PoissonDO() {
		super();
	}

	/**
	 * 
	 * @param code
	 *            Int représentant l'id du poisson
	 * @param espece
	 *            String
	 * @param description
	 *            String
	 * @param couleur
	 *            String
	 * @param longueur
	 *            String
	 * @param largeur
	 *            String
	 * @param prix
	 *            String (/!\ devise)
	 */
	public PoissonDO(final Integer code, final String espece, final String description, final String couleur, final String longueur, final String largeur,
			final String prix) {
		super();
		this.code = code;
		this.espece = espece;
		this.description = description;
		this.couleur = couleur;
		this.longueur = longueur;
		this.largeur = largeur;
		this.prix = prix;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(final Integer code) {
		this.code = code;
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

	/**
	 * @return the longueur
	 */
	public String getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur
	 *            the longueur to set
	 */
	public void setLongueur(final String longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public String getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur
	 *            the largeur to set
	 */
	public void setLargeur(final String largeur) {
		this.largeur = largeur;
	}

	/**
	 * @return the serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
