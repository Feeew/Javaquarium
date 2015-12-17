package com.javaquarium.business;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author Benjamin Service permettant de faire le lien entre la partie Client
 *         (VO) et la partie BDD (DO) en traitant notamment les dimensions
 *
 */
@Path("/poissons")
public class PoissonRestService{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getEtudiants() {
		
		return "Hello";
	}
}