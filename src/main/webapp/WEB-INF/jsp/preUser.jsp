<%@ page import="com.example.ms_watch.manage.MSController" %>
<%@ page import="com.example.ms_watch.models.MoviesSeries" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">

    <title>Premium User</title>
</head>

<body>
    <!-- Hrefleri doldurmayi untma!-->
        <div class="w3-bar w3-black w3-mobile">
            <a href="#" class="w3-bar-item w3-button w3-red">Premium</a>
                <a href="#" class="w3-bar-item w3-button">Home</a>
                <a href="#" class="w3-bar-item w3-button">User Settings</a>
                
                <a href="#" class="w3-bar-item w3-button w3-red w3-right">Out</a>
              </div>
    <div class="w3-container w3-margin">
        <div class="row">
            <div class="col-md-3">
                <div class="w3-card-4">
                    <form action="filterMS">
                        <select name="ms_type" class="w3-select">
                            <option value="%">Type</option>
                            <option value="action">Action</option>
                            <option value="dram">Drama</option>
                            <option value="comedy">Comedy</option>
                        </select>
                        <select name="producer" class="w3-select">
                            <option value="%">Producer</option>
                            <option value="fox">Fox</option>
                            <option value="marvel">Marvel</option>
                            <option value="pixar">Pixar</option>
                        </select>
                        <select name="ms" class="w3-select">
                            <option value="true">Series</option>
                            <option value="false">Movies</option>
                        </select>
                        <input type="submit" value="Get" class="w3-button w3-round w3-red w3-margin">
                    </form>
                </div>

            </div>
            <div class="col-md w3-card-4">
                <form action=""></form>
                <% List<MoviesSeries> moviesSeries = MSController.moviesSeriesList; %>
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
                            <th>
                                <c:out value="${ms.id}" />
                            </th>
                            <th>
                                <c:out value="${ms.title}" />
                            </th>
                            <th>
                                <c:out value="${ms.point}" />
                            </th>
                            <th>
                                <c:out value="${ms.cover}" />
                            </th>
                            <th>
                                <c:out value="${ms.producerId}" />
                            </th>
                            <th>
                                <c:out value="${ms.time}" />
                            </th>
                            <th>
                                <c:out value="${ms.releaseDate}" />
                            </th>
                            <th>
                                <c:out value="${ms.isSeries}" />
                            </th>
                        </tr>
                    </c:forEach>
                </table>
                </form>
            </div>
        </div>
    </div>
</body>

</html>