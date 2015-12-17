package com.javaquarium.beans.web;

/**
 * 
 * @author Benjamin Class Etudiant : Modèle de donnée pour un etudiant (rest webservice)
 */
public class Etudiant{
	private String nom;
	private String prenom;

	/**
	 * Constructeur qui affiche "vide" pour struts
	 */
	public Etudiant() {

	}

	/**
	 * Constructeur normal pour le traitement login/password
	 * 
	 * @param login
	 *            String
	 * @param password
	 *            String
	 */
	public Etudiant(final String nom, final String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
}
