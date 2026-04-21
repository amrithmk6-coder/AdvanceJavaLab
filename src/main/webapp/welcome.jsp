<%@ page language="java" %>
<%
String name = request.getParameter("username");

session.setAttribute("user", name);
session.setMaxInactiveInterval(60);

%>
<html>
<body>
<h2>Hello <%= name %>!</h2>
<p>Session will expire in 60 seconds</p>
<a href="check.jsp">Check Session</a>
</body>
</html>