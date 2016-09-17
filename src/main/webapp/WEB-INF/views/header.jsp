<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="<d:url value='/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css'/> ">
<script src="<d:url value='/resources/bootstrap-3.3.7-dist/js/jquery.js'/>"></script>
<script src="<d:url value='/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js'/>"></script>
</head>
</body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="<d:url value='product'/>">Product</a></li>
          <li><a href="<d:url value='upload'/>">upload</a></li>
          <li><a href="#">contact</a></li>
        </ul>
      </li>
     
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <d:if test="${pageContext.request.userPrincipal.name!=null }">
    	<li>${pageContext.request.userPrincipal.name }</li>
    	<li><a href="<d:url value="/logout"/>">Logout</a></li>
    	</d:if>
    <d:if test="${pageContext.request.userPrincipal.name==null }"> 	
      <li><a href="membership.obj"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      <li><a href="<d:url value='login'/>"><span class="glyphicon glyphicon-log-in"></span> login</a></li>
      </d:if>
           <li><a href="<d:url value='cart'/>"><span class="glyphicon glyphicon-shopping-cart"></span>cart</a></li>
            <li><a href="<d:url value='viewall2'/>"><span class="glyphicon glyphicon-user"></span>viewAll</a></li>      
    
    </ul>
  </div>
</nav>
</body>
</html>
