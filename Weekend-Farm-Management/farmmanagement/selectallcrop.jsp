<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Crop</title>
  </head>
  <body>

  <h2>Select All Crop</h2>

<TABLE border=1>
<tr>
<th>Name</th>
<th>Expiration</th>
<th>Division</th>
</tr>
<%     
			Vector<knu.mypackage.Crop> vec = handler.getAllCrop();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Crop crops = (knu.mypackage.Crop) vec.elementAt(i);
		%>
		<tr>
			<td><%=crops.getName()%></td>
			<td><%=crops.getExpiration()%></td>
			<td><%=crops.getDivision()%></td>		
			
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


