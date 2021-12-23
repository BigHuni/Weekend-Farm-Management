<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All IdName Descending</title>
  </head>
  <body>

  <h2>Select All IdName Descending</h2>

<TABLE border=1>
<tr>
<th>ID</th>
<th>Name</th>
</tr>
<%     
			Vector<knu.mypackage.IdNameD> vec = handler.getAllIdNameD();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.IdNameD idNameDs = (knu.mypackage.IdNameD) vec.elementAt(i);
		%>
		<tr>
			<td><%= idNameDs.getId()%></td>
			<td><%= idNameDs.getName()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


