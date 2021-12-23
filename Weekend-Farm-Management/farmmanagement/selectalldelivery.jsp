<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Delivery</title>
  </head>
  <body>

  <h2>Select All Delivery</h2>

<TABLE border=1>
<tr>
<th>ID</th>
<th>Expiration</th>
<th>District</th>

</tr>
<%     
			Vector<knu.mypackage.Delivery> vec = handler.getAllDelivery();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Delivery deliverys = (knu.mypackage.Delivery) vec.elementAt(i);
		%>
		<tr>
			<td><%=deliverys.getId()%></td>
			<td><%=deliverys.getExpiration()%></td>
			<td><%=deliverys.getDistrict()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


