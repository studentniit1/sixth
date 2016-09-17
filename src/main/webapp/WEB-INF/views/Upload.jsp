<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="false" %>    
<html>
<head>
<title>Upload file request page</title>
</head>
<body>
<form method="POST" action="uploadFile" enctype="multipart/form-data">
File to upload: <input type="file" name="file">
Name:<input type="text" name="name">
<input type="submit" file="Upload">Press here to upload the file!
</form>

</body>
</html>