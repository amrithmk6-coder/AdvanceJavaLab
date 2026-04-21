<!DOCTYPE html>
<html>
<head>
<script>
function validate(){
    let name=document.forms["f"]["username"].value;
    let email=document.forms["f"]["email"].value;
    let desig=document.forms["f"]["designation"].value;

    if(name=="" || email=="" || desig==""){
        alert("All fields required");
        return false;
    }

    let pattern=/^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if(!email.match(pattern)){
        alert("Invalid Email");
        return false;
    }

    return true;
}
</script>
</head>
<body>
<form name="f" action="UserDataServlet" method="post" onsubmit="return validate()">
Username: <input type="text" name="username"><br>
Email: <input type="text" name="email"><br>
Designation: <input type="text" name="designation"><br>
<input type="submit" value="Submit">
</form>
</body>
</html>