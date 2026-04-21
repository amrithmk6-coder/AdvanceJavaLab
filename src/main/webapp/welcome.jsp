<%@ page import="java.util.*" %>
<%
session.setMaxInactiveInterval(60);
String name = request.getParameter("username");
session.setAttribute("username", name);
%>
<html>
<body>
<h2>Hello <%= name %>!</h2>
<a href="check.jsp">Check Session</a>
</body>
</html>