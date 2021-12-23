<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Madal</title>
  </head>
  <body>

  <h2>Select All Madal</h2>

<TABLE border=1>
<tr>
<th>ID</th>
</tr>
<%     
			Vector<knu.mypackage.Madal> vec = handler.getAllMadal();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Madal madals = (knu.mypackage.Madal) vec.elementAt(i);
		%>
		<tr>
			<td><%=madals.getId()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


