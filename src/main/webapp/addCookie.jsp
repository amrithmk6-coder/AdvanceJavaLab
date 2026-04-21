<%@ page language="java" %>
<%
String name = request.getParameter("cname");
String domain = request.getParameter("cdomain");
int age = Integer.parseInt(request.getParameter("cage"));

Cookie cookie = new Cookie(name, domain);
cookie.setMaxAge(age);

response.addCookie(cookie);
%>

<html>
<body>
<h3>Cookie Added Successfully</h3>
<p>Name: <%= name %></p>
<p>Domain: <%= domain %></p>
<p>Expiry: <%= age %> seconds</p>

<a href="showCookies.jsp">Go to active cookie list</a>
</body>
</html>