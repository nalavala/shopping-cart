<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>category</title>
</head>
<body>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<%-- <form:form action="addCategory" method="post" modelAttribute="category">
 
 <table >    
         <tr>    
          <td>ID : </td>   
          <td><form:hidden path="cid"  /></td>  
         </tr>    
         <tr>    
          <td>Name :</td>    
          <td><form:input path="cname" /></td>  
         </tr>   
          <tr>    
             
          <td><input type="submit" value="Save" /></td>    
         </tr>   
  </table>
</form:form>
 --%>
 <div class="container">
 <h1>Category Form</h1>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="addCategory" method="post" modelAttribute="category">
		<div class="form-group">
			<label for="email">Category Name:</label> 
			<form:input path="cname" class="form-control" id="email" placeholder="Enter name" />
		</div>
		<div class="form-group">
			<label for="pwd">Description:</label> 
			<form:input path="description" class="form-control" id="pwd" placeholder="Enter descriptionl" />
		</div>
		
		<button type="submit" class="btn btn-default">Submit</button>
	</form:form>
</div>

	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align="center">
		<tr bgcolor="pink">
			<td>Category ID</td>
			<td>Category Name</td>
			
		</tr>

		<c:forEach items="${categorys}" var="catg">
			<tr bgcolor="cyan">
				<td>${catg.cid}</td>
				<td>${catg.cname}</td>
				
				<td><a href="<c:url value="deleteCategory/${catg.cid}"/>">Delete</a>
					<a href="<c:url value="updateCategory/${catg.cid}"/>">Update</a>
				</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>