<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="tform.html" %>
 
<%
	int val = 0;
	try {
		val = Integer.parseInt(request.getParameter("val"));
		out.println("Table for: " + val + "<br>");
		for (int i = 1; i <= 10; i++) {
			out.println(val + " x" + i + " = " + (i * val) + "<br>");
		}
	} catch (NumberFormatException e) {
		out.println("Please Enter Integer value!");
	}
	
	%>

</body>
</html>