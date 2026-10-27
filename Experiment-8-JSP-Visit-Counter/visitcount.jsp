<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Visit Counter</title>
</head>
<body>
<%
    Integer counter;

    synchronized (application) {
        counter = (Integer) application.getAttribute("counter");

        if (counter == null) {
            counter = 1;
        } else {
            counter = counter + 1;
        }

        application.setAttribute("counter", counter);
    }
%>

<h2>Welcome to my website</h2>
<p>Total number of visits: <%= counter %></p>
</body>
</html>
