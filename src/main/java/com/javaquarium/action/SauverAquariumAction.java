package com.javaquarium.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.business.AquariumService;
import com.javaquarium.business.IAquariumService;

/**
 * @author Benjamin
 *
 */
public class SauverAquariumAction extends Action {
	private static final String FW_SUCCESS = "success";

	@Override
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest request,
			final HttpServletResponse response) throws Exception {
		final IAquariumService aService = new AquariumService();
		
		final List<PoissonVO> listePoissons = new ArrayList<PoissonVO>();
		PoissonVO pVO = new PoissonVO("Nemo", "Un nemo", "rouge", "130x25", "25€");
		listePoissons.add(pVO);
		
		pVO = new PoissonVO("Nemo2", "Un nemo2", "rouge2", "130x252", "252€");
		listePoissons.add(pVO);
		
		aService.sauverAquarium(1, listePoissons);
		
		return mapping.findForward(FW_SUCCESS);
	}
}