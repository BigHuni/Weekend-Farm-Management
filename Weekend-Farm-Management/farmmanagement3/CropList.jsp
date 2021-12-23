<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Crops Management Application</title>
</head>
<body>
	<center>
		<h1>Crops Management</h1>
        <h2>
        	<a href="new">Add New Crop</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Crops</a>
        	
        </h2>
	</center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Crops</h2></caption>
            <tr>
                <th>Name</th>
                <th>Expiration</th>
                <th>Division</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="crop" items="${listCrop}">
                <tr>
                    <td><c:out value="${crop.name}" /></td>
                    <td><c:out value="${crop.expiration}" /></td>
                    <td><c:out value="${crop.division}" /></td>
                    <td>
                    	<a href="edit?name=<c:out value='${crop.name}' />">Edit</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="delete?name=<c:out value='${crop.name}' />">Delete</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>	
</body>
</html>
