<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Division</title>
  </head>
  <body>

  <h2>Select All Division</h2>

<TABLE border=1>
<tr>
<th>ID</th>
<th>Division</th>
</tr>
<%     
			Vector<knu.mypackage.Division> vec = handler.getAllDivision();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Division divisions = (knu.mypackage.Division) vec.elementAt(i);
		%>
		<tr>
			<td><%=divisions.getId()%></td>
			<td><%=divisions.getDivision()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


