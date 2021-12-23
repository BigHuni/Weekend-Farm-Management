<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All IdName</title>
  </head>
  <body>

  <h2>Select All IdName</h2>

<TABLE border=1>
<tr>
<th>ID</th>
<th>Name</th>
</tr>
<%     
			Vector<knu.mypackage.IdName> vec = handler.getAllIdName();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.IdName idNames = (knu.mypackage.IdName) vec.elementAt(i);
		%>
		<tr>
			<td><%=idNames.getId()%></td>
			<td><%=idNames.getName()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


