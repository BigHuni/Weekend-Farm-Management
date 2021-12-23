<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Fruit</title>
  </head>
  <body>

  <h2>Select ALL Fruit</h2>

<TABLE border=1>
<tr>
<th>Name</th>

</tr>
<%     
			Vector<knu.mypackage.Fruit> vec = handler.getAllFruit();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Fruit fruits = (knu.mypackage.Fruit) vec.elementAt(i);
		%>
		<tr>
			<td><%=fruits.getName()%></td>
					
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


