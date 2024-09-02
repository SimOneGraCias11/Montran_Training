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
for(int i=5;i>0;i--) {
	out.println("<h"+i + " style=color:green >JSP Tutorial</h"+i+"> ");
}



%>
</body>
</html>