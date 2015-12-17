<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="/WEB-INF/tld/struts-bean-1.2.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/tld/struts-html-1.2.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic-1.2.tld" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">
<title><bean:message key='window.title' /></title>
</head>
<body>
	<h1>
		<bean:message key='ajout.title.welcome' />
	</h1>
		<div style="color:red;">
			<html:errors />
		</div>
		<table>
			<html:form action="ajoutPoisson">
			<tr><td><bean:message key='home.tableau.titre.espece' /></td><td><html:text property="espece" /></td></tr>
			<tr><td><bean:message key='home.tableau.titre.description' /></td><td><html:text property="description" /></td></tr>
			<tr><td><bean:message key='home.tableau.titre.couleur' /></td><td><html:text property="couleur" /></td></tr>
			<tr><td><bean:message key='home.tableau.titre.prix' /></td><td><html:text property="prix" /></td></tr>
			<tr><td><bean:message key='home.tableau.titre.dimension' /></td><td><html:text property="dimension" /></td></tr>
			<tr><td><html:submit property="submit" value="Envoyer" /></td></tr>
			</html:form>
	</table>
</body>
</html>