<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<body>
<form:form action="saveSupplier" modelAttribute="supplier">

<table >    
         <tr>    
         
          <td><form:hidden path="sid"  /></td>  
         </tr>    
         <tr>    
          <td>Name :</td>    
          <td><form:input path="sname" /></td>  
         </tr>
         
         <tr>    
          <td>Address :</td>    
          <td><form:input path="address" /></td>  
         </tr>   
          <tr>    
             
          <td><input type="submit" value="Save" /></td>    
         </tr>   
  </table>
</form:form>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align="center">
		<tr bgcolor="pink">
			<td>supplier ID</td>
			<td>supplier Name</td>
			<td>supplier Address</td>
			<td>operation</td>
		</tr>

		<c:forEach items="${suppliers}" var="sup">
			<tr bgcolor="cyan">
				<td>${sup.sid}</td>
				<td>${sup.sname}</td>
				<td>${sup.address}</td>
				<td><a href="<c:url value="deleteSupplier/${sup.sid}"/>">Delete</a>
					<a href="<c:url value="updateSupplier/${sup.sid}"/>">Update</a>
				</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>