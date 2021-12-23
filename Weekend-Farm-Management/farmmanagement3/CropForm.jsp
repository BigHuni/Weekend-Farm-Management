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
		<c:if test="${crop != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${crop == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${crop != null}">
            			Edit Crop
            		</c:if>
            		<c:if test="${crop == null}">
            			Add New Crop
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${crop != null}">
        			<input type="hidden" name="no" value="<c:out value='${crop.no}' />" />
        		</c:if>       
           <tr>
                <th>NAME: </th>
                <td>
                	<input type="text" name="NAME" size="45"
                			value="<c:out value='${crop.NAME}' />"
                		/>
                </td>
            </tr>
     
            <tr>
                <th>EXPIRATION: </th>
                <td>
                	<input type="text" name="EXPIRATION" size="45"
                			value="<c:out value='${crop.EXPIRATION}' />"
                		/>
                </td>
            </tr>
          
			<tr>
                <th>DIVISION: </th>
                <td>
                	<input type="text" name="DIVISION" size="45"
                			value="<c:out value='${crop.DIVISION}' />"
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
