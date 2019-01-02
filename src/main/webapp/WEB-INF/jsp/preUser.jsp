<%@ page import="com.example.ms_watch.manage.MSController" %>
<%@ page import="com.example.ms_watch.models.MoviesSeries" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pre User</title>
</head>
<body>
<form action="filterMS">
    <select name="ms_type">
        <option value="%">Any</option>
        <option value="action">Action</option>
        <option value="dram">Drama</option>
        <option value="comedy">Comedy</option>
    </select>
    <select name="producer">
        <option value="%">Any</option>
        <option value="fox">Fox</option>
        <option value="marvel">Marvel</option>
        <option value="pixar">Pixar</option>
    </select>
    <select name="ms">
        <option value="true">Series</option>
        <option value="false">Movies</option>
    </select>
    <input type="submit" value="Get" class="w3-button w3-round w3-green w3-margin">
</form>

<form action=""></form>
<%
   List<MoviesSeries> moviesSeries = MSController.moviesSeriesList;
%>
<table class="w3-table w3-striped w3-border">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Point</th>
        <th>Cover</th>
        <th>Producer Id</th>
        <th>Time</th>
        <th>Release Date</th>
        <th>Is Series</th>
    </tr>
    <c:forEach var="ms" items="<%=moviesSeries%>">
        <tr>
            <th><c:out value="${ms.id}" /></th>
            <th><c:out value="${ms.title}" /></th>
            <th><c:out value="${ms.point}" /></th>
            <th><c:out value="${ms.cover}" /></th>
            <th><c:out value="${ms.producerId}" /></th>
            <th><c:out value="${ms.time}" /></th>
            <th><c:out value="${ms.releaseDate}" /></th>
            <th><c:out value="${ms.isSeries}" /></th>
        </tr>
    </c:forEach>
</table>
</form>

</body>
</html>