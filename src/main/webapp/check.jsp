<%@ page language="java" %>
<%
String name = (String) session.getAttribute("user");
%>
<html>
<body>
<%
if (name == null) {
%>
<h3>Session expired!</h3>
<%
} else {
%>
<h2>Hello again <%= name %>!</h2>
<%
}
%>
</body>
</html>