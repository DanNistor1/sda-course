<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

        <!-- Static content -->
        <link rel="stylesheet" href="webjars/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css"> <!-- pathul resources/static/ este scanat automat de boot strap-->
        <script src="webjars/bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/app.js"></script>

        <title>Spring Boot</title>
    </head>

    <body>
      <h1>Spring Boot - MVC web application example</h1>
      <hr>

        <div class="form">
            <form action="hello" method="post" onsubmit="return validate()">
                <table>
                    <tr>
                        <td>Enter your name</td>
                        <td><input id="name" name="name"></td>
                        <td><input type="submit" value="Submit"></td>
                    </tr>
                </table>
            </form>
        </div>
     <body>
 </html>

