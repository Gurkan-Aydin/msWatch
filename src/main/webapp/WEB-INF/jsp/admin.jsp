<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.springframework.jdbc.core.JdbcTemplate" %>
<!doctype html>
<html lang="en">
<head>
    <title>Admin</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<body>
<sql:setDataSource
        var="ms_watch"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://127.0.0.1:3306/ms_watch"
        user="root" password="6758"
/>

<sql:query var="List_Users"
           dataSource="${ms_watch}">
    Select * FROM user;
</sql:query>


<table class="w3-table w3-striped w3-border">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Last Name</th>
        <th>User Name</th>
        <th>Open Date</th>
        <th>Email Addres</th>
        <th>User Type</th>
    </tr>
    <c:forEach var="User" items="${List_Users.rows}">
        <tr>
            <th><c:out value="${User.id}" /></th>
            <th><c:out value="${User.name}" /></th>
            <th><c:out value="${User.lastname}" /></th>
            <th><c:out value="${User.user_name}" /></th>
            <th><c:out value="${User.open_date}" /></th>
            <th><c:out value="${User.email}" /></th>
            <th><c:out value="${User.type_id}" /></th>
        </tr>
    </c:forEach>
</table>
<form action="deleteUser">
    Id for User: <input type="text" name="id" value=""><br>
    <input type="submit" value="deleteUser" class="w3-padding w3-button w3-red w3-round">
</form>
<form action="updatableUser">
    Id for User: <input type="text" name="id" value=""><br>
    <input type="submit" value="Update User" class="w3-padding w3-button w3-red w3-round">
</form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>