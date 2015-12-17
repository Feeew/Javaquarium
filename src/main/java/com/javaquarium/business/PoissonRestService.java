package com.javaquarium.business;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javaquarium.beans.web.Etudiant;

/**
 * 
 * @author Benjamin Service permettant de faire le lien entre la partie Client
 *         (VO) et la partie BDD (DO) en traitant notamment les dimensions
 *
 */
@Path("/poissons")
public class PoissonRestService{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Etudiant> getEtudiants() {
		Etudiant etudiant = new Etudiant();
		etudiant.setNom("Bernard");
		etudiant.setPrenom("Jean");
		
		List<Etudiant> liste = new ArrayList<Etudiant>();
		liste.add(etudiant);
		
		return liste;
	}
}