<%@ page language="java" %>
<%
Cookie cookies[] = request.getCookies();
%>

<html>
<body>
<h2>Active Cookies</h2>

<%
if (cookies != null) {
    for (Cookie c : cookies) {
%>
<p>
Name: <%= c.getName() %> <br>
Value: <%= c.getValue() %>
</p>
<hr>
<%
    }
} else {
%>
<p>No cookies found</p>
<%
}
%>

</body>
</html>