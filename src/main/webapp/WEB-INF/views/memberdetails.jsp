<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Mvc WebFlow Demo</title>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<style>
			</style>
	</head>

	<body>
		<div class="content">
			<fieldset>
				<legend>Become Member</legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
				
				<sf:form modelAttribute="userBean"><br />
					<sf:label path="userId">UserId:</sf:label>
					<sf:input path="userId" /><br />
					<!-- to display validation messages -->
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('userId')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
					<sf:label path="email">Email Id: </sf:label>
					<sf:input path="email" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('email')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
					<sf:label path="age">Age: </sf:label>
					<sf:input path="age" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('age')}" var="err">
					  <div><span>${err.text}</span></div>
					  	</c:forEach><br />
					  	
					<sf:label path="address">Address:</sf:label>
					<sf:input path="address" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('address')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
						  	
					<sf:label path="pwd">Pwd:</sf:label>
					<sf:input path="pwd"  type="password" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('pwd')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
			<sf:label path="uname">Uname:</sf:label>
					<sf:input path="uname" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('uname')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
			
			
			
					<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
					<input name="_eventId_submit" type="submit" value="Submit" /><br />
				</sf:form>
			</fieldset>
		</div>
	</body>
	<%@include file="footer.jsp" %>
</html>