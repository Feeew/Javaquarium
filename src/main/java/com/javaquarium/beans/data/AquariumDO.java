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
@Table(name = "c_aquarium")
public class AquariumDO {
	private static final long serialVersionUID = -1335965516209871095L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "c_code")
	private Integer code;

	@Column(name = "c_idUser")
	private Integer idUser;
	
	@Column(name = "c_especePoisson")
	private String especePoisson;

	/**
	 * Constructeur sans paramètre qui appelle le constructeur parent
	 */
	public AquariumDO() {
		super();
	}

	/**
	 * 
	 * @param code
	 *            Int id auto incrémente pour gérer l'unicité de chaque enregistrement
	 * @param especePoisson
	 *            Int représentant l'id du poisson
	 * @param idUser
	 *            Int représentant l'id de l'utilisateur
	 */
	public AquariumDO(final Integer code, final String especePoisson, final Integer idUser) {
		super();
		this.code = code;
		this.especePoisson = especePoisson;
		this.idUser = idUser;
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
	public Integer getIdUser() {
		return idUser;
	}

	/**
	 * @param espece
	 *            the espece to set
	 */
	public void setIdUser(final Integer idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the description
	 */
	public String getEspecePoisson() {
		return especePoisson;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setEspecePoisson(final String especePoisson) {
		this.especePoisson = especePoisson;
	}

	/**
	 * @return the serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
