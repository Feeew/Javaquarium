package com.javaquarium.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.business.IPoissonService;
import com.javaquarium.business.PoissonService;

/**
 * @author Benjamin
 *
 */
public class ListerEspeceAction extends Action {
	private static final String FW_SUCCESS = "success";
	private static final String LISTE_POISSON = "listePoissons";

	@Override
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest request,
			final HttpServletResponse response) throws Exception {
		final IPoissonService poissonService = new PoissonService();
		final List<PoissonVO> listePoissons = poissonService.getPoissons();
		request.getSession().setAttribute(LISTE_POISSON, listePoissons);
		return mapping.findForward(FW_SUCCESS);
	}
}