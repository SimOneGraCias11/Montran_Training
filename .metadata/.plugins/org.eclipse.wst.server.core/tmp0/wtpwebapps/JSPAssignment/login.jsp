<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!String user="ABC";
String pass1="123";
%>

<%

String username=request.getParameter("name");
String password=request.getParameter("pass");

if(username.equals(user) && password.equals(pass1)){
	response.sendRedirect("StudentForm.html");
}else{
	out.println("Invalid username and password");
}
	
	
	
	
%>

</body>
</html>