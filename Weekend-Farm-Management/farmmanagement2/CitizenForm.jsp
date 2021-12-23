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
		<c:if test="${citizen != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${citizen == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${citizen != null}">
            			Edit Citizen
            		</c:if>
            		<c:if test="${citizen == null}">
            			Add New Citizen
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${citizen != null}">
        			<input type="hidden" name="no" value="<c:out value='${citizen.no}' />" />
        		</c:if>       
           <tr>
                <th>Id: </th>
                <td>
                	<input type="text" name="id" size="45"
                			value="<c:out value='${citizen.id}' />"
                		/>
                </td>
            </tr>
     
            <tr>
                <th>District: </th>
                <td>
                	<input type="text" name="district" size="45"
                			value="<c:out value='${citizen.district}' />"
                		/>
                </td>
            </tr>
          
			<tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
					
            	</td>
            </tr>
        </table>
        </form>
    </div>	
</body>
</html>
