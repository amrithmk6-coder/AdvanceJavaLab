<!DOCTYPE html>
<html>
<head>
<script>
function validate(){
    let f=document.forms["f"];
    if(f.rollno.value=="" || f.name.value==""){
        alert("Fill all fields");
        return false;
    }
    return true;
}
</script>
</head>
<body>
<form name="f" action="ResultServlet" method="post" onsubmit="return validate()">
Roll No: <input type="text" name="rollno"><br>
Name: <input type="text" name="name"><br>
Sub1: <input type="number" name="s1"><br>
Sub2: <input type="number" name="s2"><br>
Sub3: <input type="number" name="s3"><br>
Sub4: <input type="number" name="s4"><br>
Sub5: <input type="number" name="s5"><br>
<input type="submit" value="Submit">
</form>
</body>
</html>