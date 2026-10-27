<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Current Date and Time</title>
</head>
<body>
<h2>Current Date and Time</h2>
<%
    Date d = new Date();
%>
<p>Date and Time: <%= d %></p>
</body>
</html>
