<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>products</td>
		<td>product names</td>
	</tr>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach items="${prodlist}" var="prod">
	<tr>
		<td><a href="ProductDesc/${prod.pid}"><img alt="no image" src="<c:url value="resources/images/${prod.pid}.jpg"/>" height="100" width="100" /></a></td>
		<td>${prod.pid}</td>
	</tr>

</c:forEach> 


</table>
</body>
</html>