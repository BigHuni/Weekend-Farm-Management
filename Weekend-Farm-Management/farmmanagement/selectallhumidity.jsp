<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Humidity</title>
  </head>
  <body>

  <h2>Select All Humidity</h2>

<TABLE border=1>
<tr>
<th>Name</th>
</tr>
<%     
			Vector<knu.mypackage.Humidity> vec = handler.getAllHumidity();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Humidity humiditys = (knu.mypackage.Humidity) vec.elementAt(i);
		%>
		<tr>
			<td><%=humiditys.getName()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


