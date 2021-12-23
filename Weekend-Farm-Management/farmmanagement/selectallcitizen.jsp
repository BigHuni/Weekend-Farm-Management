<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Citizen</title>
  </head>
  <body>

  <h2>Select All Citizen</h2>

<TABLE border=1>
<tr>
<th>ID</th>
<th>District</th>
</tr>
<%     
			Vector<knu.mypackage.Citizen> vec = handler.getAllCitizen();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Citizen citizens = (knu.mypackage.Citizen) vec.elementAt(i);
		%>
		<tr>
			<td><%=citizens.getId()%></td>
			<td><%=citizens.getDistrict()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


