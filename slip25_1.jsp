//slip25_1.jsp
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
	<input type="text" name="pname" placeholder="Enter name">
	<input type="text" name="age" placeholder="Enter age">
	<input type="submit" value="submit">
	</form>
	<%
		String name=request.getParameter("pname");
		int age=Integer.parseInt(request.getParameter("age"));
		if(age <= 18){
			out.print("<h2>" + name +" is not eligible for voting </h2>");
		}else{
			out.print("<h2>" + name +" is  eligible for voting </h2>");
		}
	%>
</body>
</html>
