<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Viewall</title>
</head>

	<!--Container 1-->
<div class="row">
<c:forEach items="${productList}" var="product">
		<div class="col-xs-3">
			<div class="thumbnail">
				
				<img src="<c:url value="resources/img/${product.imgname}.jpg"/>"
					class="img-responsive">
				<div class="caption">
					<div class="row">
						<div class="col-md-12 col-xs-12">
						
							<center><h3>${product.name}</h3></center>
							
						</div>
					</div>

					<div class="row">
						<div class="col-md-12 col-xs-12 price">

							<h3>
								<hr>
								<center><label>${product.price}</label></center>
							</h3>
							<hr>
						</div>
					</div>
					<security:authorize access="hasAnyRole('ROLE_ANONYMOUS')"> 
					<div class="row">
						<div class="col-md-6">
							<a href="<c:url value='desc/${product.id}'/>" class="btn btn-default ">view in detail</a>
						</div>
						<div class="col-md-6">
							<a href="addtocart/${product.id}" class="btn btn-default"><span
								class="glyphicon glyphicon-shopping-cart"></span> Add to cart</a>
						</div>
					</div>
					</security:authorize> <security:authorize access="hasRole('ROLE_USER')"> 
					<div class="row">
						<div class="col-md-6">
							<a href="<c:url value='desc/${product.id}'/>" class="btn btn-default ">view in detail</a>
						</div>
						<div class="col-md-6">
							<a href="addtocart/${product.productid}" class="btn btn-default"><span
								class="glyphicon glyphicon-shopping-cart"></span> Add to cart</a>
						</div>
					</div>
					</security:authorize> 
					
		
				<security:authorize access="hasRole('ROLE_ADMIN')">
					<div class="row">
						<div class="col-md-6">
							<a href="<c:url value='edit/${product.id}'/>" class="btn btn-default "><span
								class="		glyphicon glyphicon-pencil"></span> edit</a>
						</div>
						
						<div class="col-md-6">
							<a href="<c:url value='delete/${product.id}'/>" class="btn btn-default"><span
								class="	glyphicon glyphicon-trash"></span> Delete</a>
						</div>
					</div>
				</security:authorize>
				</div>
			</div>
		</div>
		</c:forEach>
	</div>	
<%@include file="footer.jsp"%>
</html>