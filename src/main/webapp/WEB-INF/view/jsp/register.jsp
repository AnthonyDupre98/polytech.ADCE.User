<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Sign up</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Login Page">
    <title>Page d'authentification</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <meta name="theme-color" content="#563d7c">
    <style>
        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }

    </style>
</head>
<body>
<div class="container">
    <h2>Create a new user</h2>
    <% if(request.getParameter("user") != null) { %>
    <div class="errorblock"s>A user with the same username already exist</div>
    <% } %>
    <% if(request.getParameter("password") != null) { %>
    <div class="errorblock">Password must be the same</div>
    <% } %>
    <form:form modelAttribute="userregister" method="POST">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <div><label for="username"></label>Username: <input class="form-control" type="text" name="username" id="username" placeholder="Enter username"></div>
        <div><label for="password">Password: </label><input class="form-control" type="password" name="password" id="password" placeholder="Enter Password"></div>
        <div><label for="matchingpassword">Confirm Password: </label><input class="form-control" type="password" name="matchingpassword" id="matchingpassword" placeholder="Confirm Entered Password above"></div>
        <div><input type="submit" class="btn btn-lg btn-primary" style="margin-top: 20px;" role="button" value="Signup"></div>
        <a href="/doLogout">Logout</a>
    </form:form>
</div>
</body>
</html>
