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
		<bean:message key='home.title.welcome' />
	</h1>

	<table class="pure-table">

		<thead>
			<tr>
				<th><bean:message key='home.tableau.titre.espece' /></th>
				<th><bean:message key='home.tableau.titre.description' /></th>
				<th><bean:message key='home.tableau.titre.couleur' /></th>
				<th><bean:message key='home.tableau.titre.dimension' /></th>
				<th><bean:message key='home.tableau.titre.prix' /></th>
			</tr>
		</thead>
		<tbody>
			<logic:iterate id="monPoisson" name="listePoissons">
				<tr>
					<td><bean:write name='monPoisson' property='espece' /></td>
					<td><bean:write name='monPoisson' property='description' /></td>
					<td><bean:write name='monPoisson' property='couleur' /></td>
					<td><bean:write name='monPoisson' property='dimension' /></td>
					<td><bean:write name='monPoisson' property='prix' /></td>
				</tr>
			</logic:iterate>
			<tr><td><a href="UC03_ajout.jsp"><bean:message key='home.tableau.newPoisson' /></a></td></tr>
		</tbody>
	</table>

</body>
</html>