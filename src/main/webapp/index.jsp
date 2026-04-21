<%--
Build a Session Management using JSP program for getting session expiry time and your name
through text box and press submit to display the message by greeting Hello your name!.
press the following link to check it within the set session time or wait there for the minutes set to see
the session expiry.
 --%>
<!DOCTYPE html>
<html>
<body>
<form action="welcome.jsp" method="post">
Name: <input type="text" name="username" required><br>
Session Time (seconds): <input type="number" name="time" required><br>
<input type="submit" value="Submit">
</form>
</body>
</html>