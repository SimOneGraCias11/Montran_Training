<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <!--  <%@ page import="bean.Book" %> -->

<jsp:useBean id="book" class="bean.Book"/>
<jsp:setProperty property="*" name="book"/>
<jsp:getProperty property="id" name="book"/>

<jsp:getProperty property="name" name="book"/>
<jsp:getProperty property="author" name="book"/>
<jsp:getProperty property="no_pages" name="book"/>


