<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./assets/bootstrap.css">
</head>
<body>
	<div class="container h1">
		<h1>This Your dashboard</h1>
	</div>
	<hr > 
	<p>Your Company Name <%=request.getAttribute("company-name") %></p>
	<p> Welcome User <%= request.getParameter("uname") %></p>
	
	<hr>
	<a href="./profile.jsp">Profile</a>
	<a href="./profile.jsp">Profile</a>
	<a href="./profile.jsp">Profile</a>
			
</body>
</html>