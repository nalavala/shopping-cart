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
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/MobitelFrontend/updateSupplier" modelAttribute="supplier">

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
             
          <td><input type="submit" value="update" /></td>    
         </tr>   
  </table>
</form:form>

</body>
</html>