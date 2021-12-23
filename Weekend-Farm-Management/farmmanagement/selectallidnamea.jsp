<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All IdName Ascending</title>
  </head>
  <body>

  <h2>Select All IdName Ascending</h2>

<TABLE border=1>
<tr>
<th>ID</th>
<th>Name</th>
</tr>
<%     
			Vector<knu.mypackage.IdNameA> vec = handler.getAllIdNameA();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.IdNameA idNameAs = (knu.mypackage.IdNameA) vec.elementAt(i);
		%>
		<tr>
			<td><%=idNameAs.getId()%></td>
			<td><%=idNameAs.getName()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


