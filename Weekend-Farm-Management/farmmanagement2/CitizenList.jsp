<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Citizens Management Application</title>
</head>
<body>
	<center>
		<h1>Citizens Management</h1>
        <h2>
        	<a href="new">Add New Citizen</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Citizens</a>
        	
        </h2>
	</center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Citizens</h2></caption>
            <tr>
                <th>Id</th>
                <th>District</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="citizen" items="${listCitizen}">
                <tr>
                    <td><c:out value="${citizen.id}" /></td>
                    <td><c:out value="${citizen.district}" /></td>
                    <td>
                    	<a href="edit?id=<c:out value='${citizen.id}' />">Edit</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="delete?id=<c:out value='${citizen.id}' />">Delete</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>	
</body>
</html>
