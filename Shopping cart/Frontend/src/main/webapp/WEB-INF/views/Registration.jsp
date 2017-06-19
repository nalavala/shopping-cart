<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="Header.jsp" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

jQuery library
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

Latest compiled JavaScript
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="container">
<%-- <url:url value="all/register" var="url"></url:url> --%>
<form:form action="register" modelAttribute="customer" method="post" >

	<div class="form-group">
		<label for="">Enter firstname</label>
		<form:input path="firstname" class="form-control"></form:input>
		<form:errors path="firstname" ></form:errors>
	</div>
	
	<div class="form-group">
		<label for="">Enter lastname</label>
		<form:input path="lastname" class="form-control"></form:input>
		<form:errors path="lastname" ></form:errors>
	</div>
	
	<div class="form-group">
		<label for="">Enter Email</label>
		<form:input path="email" class="form-control"></form:input>
		<form:errors path="email" ></form:errors>
	</div>
	
	<div class="form-group">
		<label for="">Enter Phone</label>
		<form:input path="phone" class="form-control"></form:input>
		<%-- <form:errors path="phone" ></form:errors> --%>
	</div>
	
	
	<div class="form-group">
		<label for="">Enter Username</label>
		<form:input path="users.username" class="form-control"></form:input>
		<form:errors path="users.username"></form:errors>
	</div>
	
	<div class="form-group">
		<label for="">Enter Password</label>
		<form:input type="password" path="users.password" class="form-control"></form:input>
		<form:errors path="users.password" ></form:errors>
	</div>
	
	
	
	<div class="form-group">
		<label for="">Enter Streetname </label>
		<form:input path="billingAddress.streetname" class="form-control"></form:input>
		<form:errors path="billingAddress.streetname"></form:errors>     <!-- name should object not class -->
	</div>
	
	<div class="form-group">
		<label for="">Enter Apartmentn number</label>
		<form:input path="billingAddress.apartmentnumber" class="form-control"></form:input>
		<form:errors path="billingAddress.apartmentnumber"></form:errors>
	</div>
	
	<div class="form-group">
		<label for="">Enter city</label>
		<form:input path="billingAddress.city" class="form-control"></form:input>
		<form:errors path="billingAddress.city"></form:errors>
	</div>
	
	
	<div class="form-group">
		<label for="">Enter state</label>
		<form:input path="billingAddress.state" class="form-control"></form:input>
		<form:errors path="billingAddress.state"></form:errors>
	</div>
	
	<div class="form-group">
		<label for="">Enter zipcode</label>
		<form:input path="billingAddress.zipcode" class="form-control"></form:input>
		<form:errors path="billingAddress.zipcode"></form:errors>
	</div>
	
	<div class="form-group">
		<label for="">Enter country</label>
		<form:input path="billingAddress.country" class="form-control"></form:input>
		<form:errors path="billingAddress.country"></form:errors>
	</div>
	
	
	
	<input type="submit" value="Register">
	
</form:form>
</div>
</body>
</html>