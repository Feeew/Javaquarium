package com.javaquarium.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.javaquarium.beans.web.LoginVO;

/**
 * @author Benjamin
 *
 */
public class LoginAction extends Action {
	private static final String FW_SUCCESS = "success";
	private static final String FW_FAIL = "failed";

	@SuppressWarnings("deprecation")
	@Override
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest request,
			final HttpServletResponse response) throws Exception {
		// Recuperation du formulaire
		final LoginVO loginVO = (LoginVO) form;

		// Recuperation des données du formulaire
		final String login = loginVO.getLogin();
		final String password = loginVO.getPassword();

		final ActionErrors actionErrors = new ActionErrors();

		boolean erreur = false;
		
		// Si le login ou le mot de passe est mauvais on retourne un FAIL sinon
		if (!"bnj".equals(login)) {
			actionErrors.add("login", new ActionMessage("error.badLogin"));
			erreur = true;
		}
		if (!"bnj2".equals(password)) {
			actionErrors.add("password", new ActionMessage("error.badPassword"));
			erreur = true;
		}
		
		saveErrors(request, actionErrors);
		
		if (erreur) {
			return mapping.findForward(FW_FAIL);
		} else {
			return mapping.findForward(FW_SUCCESS);
		}
	}
}