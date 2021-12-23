<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Environment</title>
  </head>
  <body>

  <h2>Select All Environment</h2>

<TABLE border=1>
<tr>
<th>Name</th>
<th>Temperature</th>
<th>Humidity</th>
</tr>
<%     
			Vector<knu.mypackage.Environment> vec = handler.getAllEnvironment();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Environment environments = (knu.mypackage.Environment) vec.elementAt(i);
		%>
		<tr>
			<td><%=environments.getName()%></td>
			<td><%=environments.getTemperature()%></td>
			<td><%=environments.getHumidity()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


