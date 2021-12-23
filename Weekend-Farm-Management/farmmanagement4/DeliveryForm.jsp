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
		<c:if test="${delivery != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${delivery == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${delivery != null}">
            			Edit Delivery
            		</c:if>
            		<c:if test="${delivery == null}">
            			Add New Delivery
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${delivery != null}">
        			<input type="hidden" name="ID" value="<c:out value='${delivery.ID}' />" />
        		</c:if>       
           <tr>
                <th>ID: </th>
                <td>
                	<input type="text" name="ID" size="45"
                			value="<c:out value='${delivery.ID}' />"
                		/>
                </td>
            </tr>
     
            <tr>
                <th>EXPIRATION: </th>
                <td>
                	<input type="text" name="EXPIRATION" size="45"
                			value="<c:out value='${delivery.EXPIRATION}' />"
                		/>
                </td>
            </tr>
          
			<tr>
                <th>DISTRICT: </th>
                <td>
                	<input type="text" name="DISTRICT" size="45"
                			value="<c:out value='${delivery.DISTRICT}' />"
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
