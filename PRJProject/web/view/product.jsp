<%-- 
    Document   : product
    Created on : Feb 28, 2022, 5:21:31 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" enctype="multipart/form-data" action="product">
            <input type="text" name="name"> <br>
            <input type="file" name="image"></br>
            <input type="submit">

        </form>
    </body>
</html>
