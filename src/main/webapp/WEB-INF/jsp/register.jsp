<!doctype html>
<html lang="en">

<head>
    <title>Login</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
          crossorigin="anonymous">

    <style>
        body, html {
            height: 100%;
        }

        .bg {
            /* The image used */

            /* Full height */
            height: 100%;

            /* Center and scale the image nicely */
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>

<body>
<img src="https://wallpapercave.com/wp/wp2167748.jpg" alt="" class=".bg">
<div class="w3-container w3-centered" style="min-width: 300px;">
    <div class="w3-card-4 w3-display-right w3-margin w3-white">
        <form action="register">
            <div class="form-group w3-margin">
                <label>Name:</label>
                <input type="text" name="name" value="" class="form-control" />
            </div>
            <div class="form-group w3-margin">
                <label>Last Name:</label>
                <input type="text" name="lastName" value="" class="form-control" />
            </div>
            <div class="form-group w3-margin">
                <label>User Name:</label>
                <input type="text" name="userName" value="" class="form-control" />
            </div>
            <div class="form-group w3-margin">
                <label>Password:</label>
                <input type="password" name="password" value="" class="form-control" />
            </div>
            <div class="form-group w3-margin">
                <label>Birthday:</label>
                <input type="date" name="birthday" value="" class="form-control ">
            </div>
            <div class="form-group w3-margin">
                <label>Email:</label>
                <input type="email" name="email" value="" class="form-control" />
            </div>

            <input type="submit" value="Create" class="w3-padding w3-margin w3-button w3-green w3-round" style="padding-top: 16px; padding-left: 16px">
        </form>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</body>

</html>