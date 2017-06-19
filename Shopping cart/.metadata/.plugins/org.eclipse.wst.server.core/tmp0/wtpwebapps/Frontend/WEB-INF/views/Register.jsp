<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%-- <form:form action="addUser" method="post" modelAttribute="user">
 
<div class="container">
<div class="error" style="color: #ff0000;">${username}${email}${mobile }${password }${address}</div>
 <table >    
 
 
 
         <tr>    
          <td>username </td>   
          <td><form:input path="username"  /></td>
          <td><form:errors path="username" cssClass="error"></form:errors></td>
         </tr>    
         <tr>    
          <td>password:</td>    
          <td><form:input path="password" /></td> 
          <td><form:errors path="password"    cssStyle="color: #ff0000"></form:errors></td> 
         </tr>
         
         <tr>    
          <td>email:</td>    
          <td><form:input path="email" /></td> 
          <td><form:errors path="email" cssClass="error"></form:errors></td> 
         </tr>
         
        
         
          <tr>    
          <td>mobile:</td>    
          <td><form:input path="mobile" /></td>  
          <td><form:errors path="mobile" cssClass="error"></form:errors></td>
         </tr>
         
          <tr>    
          <td>Address:</td>    
          <td><form:input path="address" /></td>  
          <td><form:errors path="address" cssClass="error"></form:errors></td>
         </tr>
            
          <tr>    
             
          <td><input type="submit" value="Save" /></td>    
         </tr>   
  </table>
   </div>
 </form:form> --%>
 
 <div class="container">
  <h2>Register Form</h2>
  <form:form action="addUser" method="post" modelAttribute="user">
  
    <div class="form-group">
      <label for="name">UserName:</label>
      <form:PasswordInput path="username" class="form-control" id="name" placeholder="Enter UserName" />
      <form:errors path="username"    cssStyle="color: #ff0000"></form:errors>
    </div>
    
    <div class="form-group">
      <label for="pwd">Password:</label>
      <form:input path="password" class="form-control" id="pwd" placeholder="Enter Password" />
      <form:errors path="password"    cssStyle="color: #ff0000"></form:errors>
    </div>
    
    <div class="form-group">
      <label for="pno">Phone Number:</label>
      <form:input path="mobile" class="form-control" id="pno" placeholder="Enter Phone" />
      <form:errors path="mobile"    cssStyle="color: #ff0000"></form:errors>
    </div>
    
    <div class="form-group">
      <label for="pno">Email:</label>
      <form:input path="email" class="form-control" id="pno" placeholder="Enter email" />
      <form:errors path="email"    cssStyle="color: #ff0000"></form:errors>
    </div>
    
    <div class="form-group">
      <label for="pno">Address:</label>
      <form:input path="address" class="form-control" id="pno" placeholder="Enter address" />
      <form:errors path="address"    cssStyle="color: #ff0000"></form:errors>
    </div>
    
    <button type="submit" class="btn btn-default">Submit</button>
    
  </form:form>
</div>

</body>
</html>