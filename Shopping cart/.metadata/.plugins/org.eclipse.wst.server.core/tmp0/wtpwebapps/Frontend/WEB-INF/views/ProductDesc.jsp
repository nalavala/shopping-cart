<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<table>
		<tr>
			<td rowspan="6"><img alt="no img" src="H:/nvr/Frontend/src/main/webapp/WEB-INF/resources/images/${prodinfo.pid}.jpg" height="500" width="500">
		</tr>
		<tr>
			<td>Product ID</td>
			<td>${prodinfo.pid}</td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td>${prodinfo.pname}</td>
		</tr>
		<tr>
			<td>Supplier</td>
			<td>${prodinfo.suppid}</td>
		</tr>
		<tr>
			<td>Product Desc</td>
			<td>${prodinfo.description}</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${prodinfo.price}</td>
		</tr>
		<tr>
			<td><a href="/Frontend/viewCart">Add Cart</a></td>
			<td><a>buy now</a></td>
		</tr>



	</table>
</body>
</html>