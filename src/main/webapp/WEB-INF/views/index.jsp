<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<h2><marquee>..............BABY-PRODUCTS....................................
Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor
</marquee></h2>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="<d:url value='/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css'/> ">
<script src="<d:url value='/resources/bootstrap-3.3.7-dist/js/jquery.js'/>"></script>
<script src="<d:url value='/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js'/>"></script>
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width:100%;
      margin-top:auto; 
      }
  }
  </style>
  </head>
<body>
${msg}<br>
<!-- ---- --<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="product">Product</a></li>
          <li><a href="upload">upload</a></li>
          <li><a href="#">contact</a></li>
        </ul>
      </li>
     
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="membership.obj"><span class="glyphicon glyphicon-user"></span> Register</a></li>
      <li><a href="<d:url value='login'/>"><span class="glyphicon glyphicon-log-in"></span> login</a></li>
           <li><a href="cart"><span class="glyphicon glyphicon-shopping-cart"></span> cart</a></li>
      
    </ul>
  </div>
</nav>------>
<div class="container">

  <a href="admin/abc">click here</a>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
     <div class="carousel-inner" role="listbox">
<div class="item active">
 <img src="<d:url value='resources/img/q6.jpg'/>"alt="Chania" style="width:100%">
      </div>

      <div class="item">
        <img src="<d:url value='/resources/img/q5.jpg'/>" alt="Chania" style="width:100%"> 
      </div>
      <div class="item">
        <img src="<d:url value='/resources/img/hy.jpg'/>" alt="Flower" style="width:100%">    
      </div>
      <div class="containerflow">
 
 <div class="row">
    <div class="col-sm-4">
     <img src="<d:url value='/resources/img/1e.jpg'/>" class="img-rounded"  width="304" height="236"></div>
    
    <div class="col-sm-4" >
     <img src="<d:url value='/resources/img/2e.jpg'/>" class="img-rounded"  width="304" height="236"></div>
    
    <div class="col-sm-4">
     <img src="<d:url value='/resources/img/34e.jpg'/>" class="img-rounded"  width="304" height="236"></div>
    
  </div>
      
      
    </div>
    <div>
 <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
 <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
    </div>
  </div>
</div>

</div>
<section>
		<div class="container">
		<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Category</h2>
						
						<div class="panel-group category-products" id="accordian"><!--category-productsr-->
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a data-toggle="collapse" data-parent="#accordian" href="#babyproducts">
											<span class="badge pull-right"><i class="fa fa-plus"></i></span>
											babyproducts
										</a>
									</h4>
								</div>
								<div id="babyproducts" class="panel-collapse collapse">
									<div class="panel-body">
										<ul>
											<li><a href="#">oil </a></li>
											<li><a href="#">babypowder </a></li>
											<li><a href="#">babylotion </a></li>
											<li><a href="#">babyshampoos</a></li>
											<li><a href="#">babysoap</a></li>
										</ul>
									</div>
								</div>
							</div>
						
<%@include file="footer.jsp" %>
</body>
</html>




