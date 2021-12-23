<%@ page import="java.sql.*, javax.naming.*, javax.sql.*, java.util.*" %>

<jsp:useBean id="handler" class="knu.mypackage.FarmHandler" scope="page"/>

<html>
  <head>
    <title>Select All Vegetable</title>
  </head>
  <body>

  <h2>Select All Vegetable</h2>

<TABLE border=1>
<tr>
<th>Name</th>
</tr>
<%     
			Vector<knu.mypackage.Vegetable> vec = handler.getAllVegetable();

			for (int i = 0; i < vec.size(); i++) {
			knu.mypackage.Vegetable vegetables = (knu.mypackage.Vegetable) vec.elementAt(i);
		%>
		<tr>
			<td><%=vegetables.getName()%></td>	
			
		</tr>
		<%
			}
		%>
		<br />
	</TABLE>

  </body>
</html>


