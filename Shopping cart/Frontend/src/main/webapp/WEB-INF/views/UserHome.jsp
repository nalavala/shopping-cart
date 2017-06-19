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
		<td><a href="ProductDesc/${prod.pid}"><img alt="no image" src="<c:url value="/resources/images/${prod.pid}.jpg"/>" height="100" width="100" /></a></td>
		<td>${prod.pid}</td>
	</tr>

</c:forEach> 

<div class="container">
  <div class="row">
  <c:forEach items="${prodlist}" var="prod">
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="ProductDesc/${prod.pid }" target="_self">
          <img src="<c:url value="/resources/images/${prod.pid}.jpg"/>" alt="Lights" style="width:100%">
          <div class="caption">
            <p>${prod.pname }</p>
            <p > &#x20B9; <b style="color:#FF0000">${prod.price }</b></p>
          </div>
        </a>
      </div>
    </div>
  </c:forEach>
  </div>
</div>





</table>
</body>
</html>