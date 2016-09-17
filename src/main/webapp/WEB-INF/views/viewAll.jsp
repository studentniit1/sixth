<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp"%>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Product Detail</h1>


			<p class="lead">Here is the detail information of the product:</p>
		</div>

		<div class="container" data-ng-app="cartApp">
			<div class="row">
				<div class="col-md-5">
					<img
						src="<d:url value="/resources/img/${product.productId}14.png" />"
						alt="image" style="width: 100%" />
				</div>
			</div>
			<div class="col-md-5">
				<h3><strong>Product Name</strong>:${product.productName}</h3>
				<p><strong>Product Description</strong>:${product.productDescription}</p>
<!-- 				<p> -->
<%-- 					<strong>Manufacturer</strong>: ${product.productManufacturer} --%>
<!-- 				</p> -->
				<p>
					<strong>Category</strong>: ${product.productCategory}
				</p>
<!-- 				<p> -->
<%-- 					<strong>Condition</strong>: ${product.productCondition} --%>
<!-- 				</p> -->
				<p><strong>Price</strong>:${product.productPrice}USD</p>


				<br />

				<d:set var="role" scope="page" value="${param.role}" />
				<d:set var="url" scope="page" value="/product/productList" />
				<d:if test="${role='admin'}">
					<d:set var="url" scope="page" value="/admin/productInventory" />
				</d:if>

				<p data-ng-controller="cartCtrl">
					<a href="<d:url value = "${url}" />" class="btn btn-default">Back</a>
					<a href="#" class="btn btn-warning btn-large"
						ng-click="addToCart('${product.productId}')"><span
						class="glyphicon glyphicon-shopping-cart"></span> Order Now</a>
						 <a href="<spring:url value="/cart" />" class="btn btn-default"><span
						class="glyphicon glyphicon-hand-right"></span> View Cart</a>
				</p>
			</div>
		</div>
	</div>
</div>


<!-- My -->
<script src="<c:url value="/resources/js/controller.js?v3" /> "></script>

<%@ include file="footer.jsp"%>