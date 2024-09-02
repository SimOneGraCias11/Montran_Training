<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
double radius=Double.parseDouble(request.getParameter("radius"));
double pi=Math.PI;
double sphere=(4.0/3.0)*pi*radius*radius*radius;

%>

Volume of Sphere:<%= sphere %><br>

<a href="surface.jsp?radius=<%= radius %>"> Calculate Surface Area</a>

</body>
</html>