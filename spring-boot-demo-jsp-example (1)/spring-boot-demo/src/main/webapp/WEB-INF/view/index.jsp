<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div align="center"; style ="background-color:CadetBlue ">
<h1>WELCOME TO PRODUCT INVENTORY</h1>
</div>
	<div align="center";style ="background-color:grey;margin: 0px auto; position: relative; width: 222px; ">
        <table border="1" cellpadding="5" width=50%>
           
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Memory</th>
            </tr>
            <c:forEach var="item" items="${names}">
                <tr>
                    <td><c:out value="${item.id}" /></td>
                    <td><c:out value="${item.name}" /></td>
                    <td><c:out value="${item.price}" /></td>
                    <td><c:out value="${item.memory}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <br>
    <br>
    <br>
    <marquee width="100%" direction="right" height="100px" style="font-size:20px;background-color: lime; ">
Our jobs as marketers are to understand how the customer wants to buy and help them to do so.
</marquee>
</body>
</html>
