//as4SetA2.jsp
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	try{
		Class.forName("org.postgresql.Driver");
		Connection con;
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gayatri","postgres","");
		String q="select * from hospital";
		PreparedStatement pmt=con.prepareStatement(q);
		ResultSet rs=pmt.executeQuery();
	%>
	<table border="1">
		<tr>
			<th>Pno</th>
			<th>Pname</th>
			<th>Address</th>
			<th>Age</th>
			<th>Disease</th>
		</tr>
		<% while(rs.next()){ %>
			<tr>
			<td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getInt(4) %></td>
			<td><%=rs.getString(5) %></td>
			</tr>
		<% } %>
	</table>
		
	<% }catch(Exception e){
		System.out.println(e);	
	}%>
	
</body>
</html>
