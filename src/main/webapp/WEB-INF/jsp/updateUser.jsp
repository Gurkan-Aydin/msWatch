<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update</title>
</head>
<body>
<sql:setDataSource
        var="ms_watch"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://127.0.0.1:3306/ms_watch"
        user="root" password="6758"
/>
<%
    int id =Integer.parseInt(request.getAttribute("id")+"");
%>

<sql:query var="u_list"
dataSource="${ms_watch}">
Select * FROM user where id = <%= id%>;
</sql:query>

<form action="updateUser">
    Name: <input type="text" name="name" value="${u_list}" /><br>
    Last Name: <input type="text" name="lastName" value="" /><br>
    User Name: <input type="text" name="userName" value="" /><br>
    Password: <input type="password" name="password" value="" /><br>
    Birthday: <input type="date" name="birthday" value=""><br>
    Email: <input type="email" name="email" value="" /><br>


    <input type="submit" value="Create">
</form>
</body>