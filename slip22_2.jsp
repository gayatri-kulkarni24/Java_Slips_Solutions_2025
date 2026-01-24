//slip22_2.jsp
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>22ii</title>
</head>
<body>
	<form action="#" method="post">
		<input type="text" name="user" placeholder="Enter name">
		<input type="submit" value="generate message">
	</form>
	<%
		Calendar calendar=Calendar.getInstance();
		String name=request.getParameter("user");
		int hrs=calendar.get(Calendar.HOUR_OF_DAY);
		String greet="";
		if(hrs>=5 && hrs<=12){
			greet="Good morning";
		}else if(hrs>12 && hrs<=18){
			greet="Good Afternoon";
		}else{
			greet="Good Evening";
		}
		out.println("<h1>"+greet+"  "+name+"</h1>");
	%>
</body>
</html>
