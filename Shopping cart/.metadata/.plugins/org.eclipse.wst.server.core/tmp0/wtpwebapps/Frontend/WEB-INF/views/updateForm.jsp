<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="/Frontend/UpdateCategory" method="post" modelAttribute="category">

<table >    
         <tr>    
          <td>ID : </td>   
          <td><form:input path="cid"  /></td>  
         </tr>    
         <tr>    
          <td>Name :</td>    
          <td><form:input path="cname" /></td>  
         </tr>   
          <tr>    
             
          <td><input type="submit" value="update" /></td>    
         </tr>   
  </table>

</form:form>
</body>
</html>