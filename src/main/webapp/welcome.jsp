<%
String name = request.getParameter("username");
int time = Integer.parseInt(request.getParameter("time"));
session.setAttribute("username", name);
session.setMaxInactiveInterval(time);
%>
<html>
<body>
<h2>Hello <%= name %>!</h2>
<a href="check.jsp">Check Session</a>
</body>
</html>