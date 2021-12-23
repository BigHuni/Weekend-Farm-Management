<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Dogye</title>
  </head>
  <body>

  <h2>Select All Dogye</h2>

<TABLE border=1>
<tr>
<th>ID</th>
</tr>
<%     
			Vector<knu.mypackage.Dogye> vec = handler.getAllDogye();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Dogye dogyes = (knu.mypackage.Dogye) vec.elementAt(i);
		%>
		<tr>
			<td><%=dogyes.getId()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


