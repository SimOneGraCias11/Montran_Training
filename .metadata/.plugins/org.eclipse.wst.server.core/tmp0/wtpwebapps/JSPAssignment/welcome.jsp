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

int id=Integer.parseInt(request.getParameter("id")); 
String name=request.getParameter("name");
String gender=request.getParameter("gender");
String[] skills=request.getParameterValues("skill");

int hours=(new java.util.Date().getHours());
String greet;

if(hours>=0 && hours <12){
	greet="Good Morning";
}else if(hours>=12 && hours<17){
	greet="Good Afternoon";
}else{
	greet="Good Evening";
}


%>
<h2> <%=greet %>,
<%= name %>
</h2>

<p>id: <%=id %></p>
<p>gender:<%=gender %></p>
<p>Skills:</p>
<ul>
<% for(String skill :skills)
{%>
	<li> <%=skill %></li>
	<%} %>

	
</ul>

</body>
</html>