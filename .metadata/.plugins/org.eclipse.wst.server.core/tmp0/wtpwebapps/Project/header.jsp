<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body,html{
margin:0;
padding:0;
height:100%;
display:flex;
flex-direction:column;
}
.navbar{
background-color:#333;
overflow:hidden;
padding:10px 15px;
position:fixed;
top:0;
width:100%;
z-index:1000;
box-sizing:border-box;
}

.navbar a{
float:left;
color:white;
text-align:center;
padding:8px 15px;
text-decoration:none;
font-size:16px;

}
.navbar a:hover{
background-color:#ddd;
color:black;
}

.navbar a.active{
background-color:#4CAF50;
color:white;
}
.content{
padding-top:60px;
flex:1;
overflow-y:auto;

}
</style>
</head>
<body>
<div class="navbar"> 
<a href="adminHome.jsp" >Admin Home</a>
<a href="addCategories">Add Categories</a>
<a href="viewCategories" >View Categories</a>
<a href="addProduct">Add Product</a>
<a href="viewProduct">View Product</a>

</div>
<div class="content"></div>
</body>
</html>