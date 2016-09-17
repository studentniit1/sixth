<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Upload File Request Page</title>
</head>
<body>
<form  action="upload"  enctype="multipart/form-data" >
File to Upload:<input type="file" name="file"/>
Name:<input type="text" name="name" />
<input type="submit" value="upload"/>press here to upload the file!
</form>
 	
</body>
</html>
