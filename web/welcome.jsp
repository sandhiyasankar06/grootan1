<%-- 
    Document   : welcome
    Created on : 27 Sep, 2021, 9:48:36 AM
    Author     : pradeev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
    <center> <h1>Welcome</h1></center>
    <%
String session_u_name = (String)session.getAttribute("userame");
out.print("Hi "+session_u_name);
%>
    <center><a href="http://localhost:8084/Login/">Log Out</a></center>
    <form action="ProfileSession" method="POST">
        <a href="ProfileSession">Profile</a>
        
    </form>
</body>
</html>
