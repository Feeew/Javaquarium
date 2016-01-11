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
<title>JavAquarium</title>
</head>
<body>
	<h1>
		<bean:message key='home.title.welcome' />
	</h1>
	<div style="color: red;">
		<html:errors />
	</div>
	<html:form action="loginUser">
		<bean:message key='home.tableau.titre.login' /> <html:text property="login" />
		<bean:message key='home.tableau.titre.password' /> <html:password property="password" />
		<html:submit property="submit" value="Envoyer" />
	</html:form>
</body>
</html>