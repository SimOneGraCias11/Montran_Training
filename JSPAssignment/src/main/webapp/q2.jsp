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

int numb1= Integer.parseInt(request.getParameter("num1"));
int numb2= Integer.parseInt(request.getParameter("num2"));

String operation=request.getParameter("operations");


int res=0;

if(operation.equals("add")){
	res=numb1+numb2;
	
}else if(operation.equals("sub")){
	res=numb1-numb2;
}else if(operation.equals("mult")){
	res=numb1*numb2;
}
out.println("Result :" +res);

%>
</body>
</html>