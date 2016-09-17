<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Mvc WebFlow Demo</title>
		<link href="style.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div class="content">
			<fieldset>
				<legend>Member Home Page</legend>
				<!-- here the href's value will be used to decide the 
					 controller to be executed on click of this link.
					 here "home" is mapped in spring mvc controller-->
				<a href="home.obj">Home</a>
				<br /><br />
				<h2><!-- display the userId just entered -->
				Welcome ${userBean.userId }</h2>
				<br/>
			</fieldset>
		</div>
	</body>
</html>