<%
String name = (String) session.getAttribute("username");
%>
<html>
<body>
<%
if (name != null) {
%>
<h2>Hello <%= name %>! Session Active</h2>
<%
} else {
%>
<h2>Session Expired</h2>
<%
}
%>
</body>
</html>