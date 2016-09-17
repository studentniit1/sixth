<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="productmodel" method="POST"
		modelAttribute="ob" enctype="multipart/form-data">
		<tr>
			<td>Product ID</td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Product Description</td>
			<td><form:input path="description" /></td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td><form:input path="price" /></td>
		</tr>
		
		
		<tr>
			
			<td><form:input path="file" type="file" /></td>
		</tr>
		<tr>
			<td>IMAGE NAME</td>
			<td><form:input path="imgname" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" /> <input
				type="submit" name="action" value="Delete" /> <input type="submit"
				name="action" value="Search" /></td>
		</tr>
		<br>
		<tr>
			<td>VARIETY</td>
			<form:select path="variety" name="VARIETY">          
			 <form:option value="NONE" label="--- Select ---"/>
   			<form:option value="BabyPowders">BABYPOWDERS</form:option>
   			<form:option value="BabyOil">BABYOIL</form:option>
  		 	<form:option value="Shampoos">SHAMPOOS</form:option>
  		 	<form:option value="BabySoap">BABYSOAP</form:option>
  		 	<form:option value="BabyLotion">BABYLOTION</form:option>
			</form:select>
		</tr>
		<br>
		<br>
		
		<table border="1">
			<th>ID</th>
			<th>NAME</th>
			<th>DESCRIPTION</th>
			<th>PRICE</th>
			<th>VARIETY</th>
			<c:forEach items="${productsList}" var="productModel">
				<tr>
					<td>${productModel.id}</td>
					<td>${productModel.name}</td>
					<td>${productModel.description}</td>
					<td>${productModel.price}</td>
                     <td>${productModel.variety}</td>


				</tr>

			</c:forEach>
		</table>

	</form:form>
</body>
</html>
