<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div class="container">

<table cellspacing="3" align="center">
<tr>	
	<td colspan="5"><center><h3>Shopping Cart</h3></center></td>
</tr>
<tr bgcolor='pink'>
	<td>Product </td>
	<td>Quantity</td>
	<td>SubTotal</td>
	<td>Image</td>
	<td>Operation</td>
</tr>
<c:forEach items="${list}" var="cartitem">
	<form action="<c:url value="/updateCartItem/${cartitem.pname}"/>" method="get">
	<tr>	
		<td>${cartitem.pid}</td>
		<td><input type="text" name="qty" value="${cartitem.quantity}"/></td>
		<td>${cartitem.subtotal}</td>
		<td><img src="<c:url value='/resources/images/${cartitem.pid}.jpg'/>" width="100" height="100" /></td>
		<td>
			<a href="<c:url value="/deleteCartItem/${cartitem.id}"/>">Delete</a>
			<input type="submit" value="UPDATE" class="btn btn-xs btn-success btn-block"/>
		</td>
	</tr>
	</form>
</c:forEach>
	<tr>
		<td colspan="2"><a href="<c:url value='/UserHome'/>">Continue Shopping</a>
		<td colspan="3"><a href="<c:url value='/ConfirmOrder'/>">Check Out</a>
	</tr>
</table>

</div>
</body>
</html>