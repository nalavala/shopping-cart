<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Clear cart</title>

    
    
  </head>
  <body>
  <!--  <link href="resources/css/bootstrap.css" rel="stylesheet">
    
    <link href="resources/css/custom.css" rel="stylesheet">
   
    <script src="resources/js/jquery.js"></script>
    
    <script src="resources/js/bootstrap.js"></script>
   -->
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      
      <a class="navbar-brand" href="index.htm">
          <img src="<c:url value="/resources/images/logo.png"/>" alt="google-logo"/>
      </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" >
      <ul class="nav navbar-nav">
       <c:if test="${pageContext.request.userPrincipal.name!=null }">
      <c:if test="${pageContext.request.userPrincipal.name!='admin'}">
        <li><a  href="<c:url value="/UserHome" />"> <span class="glyphicon glyphicon-home"></span> Home</a></li>
        <!-- <li><a href="/Frontend/registrationform">Register</a></li> -->
     
        </c:if></c:if>
        
         <c:if test="${pageContext.request.userPrincipal.name!=null }">
         <c:if test="${pageContext.request.userPrincipal.name=='admin' }">
        <li  ><a href="supplierform">supplier</a></li>
        <li  ><a href="Category">category</a></li>
         <li><a href="Product">product</a></li>
        </c:if>
          </c:if>
        
        
        
        <li><a href="<c:url value="/index" />" >Home</a>
       
        <li><a href="#">Contact Us</a></li>
 		    
     
     
     
      </ul>
      
  

      
      <ul class="nav navbar-nav navbar-right">
         <!--  <form class="navbar-form navbar-left">
            <div class="form-group">
             <input type="text" class="form-control" placeholder="Search">
           </div>
            <button type="submit" class="btn btn-default">Submit</button>
          </form> -->
          <c:if test="${pageContext.request.userPrincipal.name==null }">
        <li><a href="login">login</a></li>
        <li><a href="/Frontend/registrationform">sign up</a></li>
        </c:if>
     	<c:if test="${pageContext.request.userPrincipal.name!=null }">
     		<c:if test="${pageContext.request.userPrincipal.name!='admin' }">
		<li><a href="<c:url value="/viewcart"></c:url>"><span class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
		  
       </c:if> 
     		   <li>	<a href="<c:url value="/j_spring_security_logout"></c:url>"> logout </a></li>
			  
			 
		</c:if> 
		
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
  </body>
</html>