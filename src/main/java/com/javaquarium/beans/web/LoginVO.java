package com.javaquarium.beans.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * 
 * @author Benjamin Class LoginVO : Modèle de donnée pour l'identification
 */
public class LoginVO extends ActionForm {
	private static final long serialVersionUID = -1335965516209871095L;

	private String login;
	private String password;

	/**
	 * Constructeur qui affiche "vide" pour struts
	 */
	public LoginVO() {
		System.out.println("Vide");
	}

	/**
	 * Constructeur normal pour le traitement login/password
	 * 
	 * @param login
	 *            String
	 * @param password
	 *            String
	 */
	public LoginVO(final String login, final String password) {
		super();
		this.login = login;
		this.password = password;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(final String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	@Override
	public ActionErrors validate(final ActionMapping mapping, final HttpServletRequest request) {
		final ActionErrors actionErrors = new ActionErrors();
		
		//Si la description ne contient pas de X on ne peut rien faire
		if(login.isEmpty() || login == null){
			actionErrors.add("login", new ActionMessage("error.loginEmpty"));
		}
		if(password.isEmpty() || password == null){
			actionErrors.add("password", new ActionMessage("error.passwordEmpty"));
		}
		
		return actionErrors;
	}
}
