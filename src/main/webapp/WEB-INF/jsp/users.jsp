<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url value="/css/main.css" htmlEscape="true" var="mainCSS" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.1.0/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${mainCSS}" />
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h2>Utenti disponibili</h2>
		</div>
		<table class="table">
		<tr>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Email</th>
			<th>Tipo</th>
			<th>&nbsp;</th>
		</tr>
	    <c:forEach items="${utenti}" var="utente">
		<tr>
			<td>${utente.nome}</td>
			<td>${utente.cognome}</td>
			<td>${utente.email}</td>
			<td>${utente.tipo}</td>
			<td><a href="/user/${utente.id}">Edit</a></td>
		</tr>    	
	    </c:forEach> 
		</table>
	</div>
	<script type="text/javascript" src="webjars/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.min.js"></script>
</body>
</html>