<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1>/WEB-INF/views/fileupload/page.jsp</h1>

<hr>

<form 
	action="doit"
	method="POST"
	enctype="multipart/form-data">

	<div><input type="file" name="files"></div>
	<div><input type="file" name="files"></div>
	<div><input type="file" name="files"></div>
	<div><input type="file" name="files"></div>
	<div><input type="file" name="files"></div>

	<div><input type="submit" value="Upload"></div>

</form>

</body>
</html>
