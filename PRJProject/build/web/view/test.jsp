<%-- 
    Document   : test
    Created on : Mar 8, 2022, 12:27:49 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>ProductID</th>
                    <th>ProductName</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>QuantityPerUnit</th>
                    <th>Category</th>
                    <th>Description</th>   
                    <th>Color</th>
                    <th>Size<th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.listProducts}" var="p"> 
                    <tr>
                        <td>${p.productID}</td>
                        <td>${p.productName}</td>
                        <td>${p.price}</td>
                        <td>${p.quantity}</td>
                        <td>${p.category.categoryID}</td>
                        <td>${p.quantityPerUnit}</td>
                        <td>${p.description}</td>   
                        <td>
                            <c:forEach items="${p.listColors}" var="color">
                                ${color}
                            </c:forEach>
                        </td>
                        <td>
                            <c:forEach items="${p.listSizes}" var="size">
                                ${size}
                            </c:forEach>
                        </td>                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
