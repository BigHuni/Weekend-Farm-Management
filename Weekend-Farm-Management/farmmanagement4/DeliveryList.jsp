<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Deliverys Management Application</title>
</head>
<body>
	<center>
		<h1>Deliverys Management</h1>
        <h2>
        	<a href="new">Add New Delivery</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Deliverys</a>
        	
        </h2>
	</center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Deliverys</h2></caption>
            <tr>
                <th>ID</th>
                <th>Expiration</th>
                <th>District</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="delivery" items="${listDelivery}">
                <tr>
                    <td><c:out value="${delivery.ID}" /></td>
                    <td><c:out value="${delivery.expiration}" /></td>
                    <td><c:out value="${delivery.district}" /></td>
                    <td>
                    	<a href="edit?ID=<c:out value='${delivery.ID}' />">Edit</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="delete?ID=<c:out value='${delivery.ID}' />">Delete</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>	
</body>
</html>
