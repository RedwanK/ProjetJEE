<%-- 
    Document   : index
    Created on : 7 janv. 2019, 09:13:14
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="./assets/style.css" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body id="LoginForm">
<div class="container">
<h1 class="form-heading">login Form</h1>
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Admin Login</h2>
   <p>Please enter your email and password</p>
   </div>
    <form id="Login" method="post" action="login.jsp">

        <div class="form-group">


            <input type="text" class="form-control" id="inputEmail" name="inputEmail" placeholder="Email Address">

        </div>

        <div class="form-group">

            <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password">

        </div>
        <div class="forgot">
        <a href="index.html">Forgot password?</a>
</div>
        <button type="submit" class="btn btn-primary">Login</button>

    </form>
    </div>

</div></div>


</body>
</html>
