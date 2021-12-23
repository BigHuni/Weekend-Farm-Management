<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Temperature</title>
  </head>
  <body>

  <h2>Select All Temperature</h2>

<TABLE border=1>
<tr>
<th>Name</th>
</tr>
<%     
			Vector<knu.mypackage.Temperature> vec = handler.getAllTemperature();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Temperature temperatures = (knu.mypackage.Temperature) vec.elementAt(i);
		%>
		<tr>
			<td><%=temperatures.getName()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


