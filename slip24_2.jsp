//slip24_2.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="#" method="post">
	<input type="text" name="username" placeholder="Enter username">
	<input type="password" name="password" placeholder="Enter password">
	<input type="submit" value="submit">
	</form>
	<%
		String user="gsk";
		String pass="gsk123";
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(user.equals(username) && pass.equals(password)){
			out.print("<h1>Login succesfull</h1>");
			response.sendRedirect("customer.html");
		}else{
			out.print("<h1>Login failed</h1>");
		}
	%>
</body>
</html>
