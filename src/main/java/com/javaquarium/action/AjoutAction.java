package com.javaquarium.action;

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
public class AjoutAction extends Action {
	private static final String FW_SUCCESS = "success";

	@Override
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		final PoissonVO poissonVO = (PoissonVO) form;
		
		final IPoissonService poissonService = new PoissonService();
		poissonService.addPoisson(poissonVO);

		return mapping.findForward(FW_SUCCESS);
	}
}
