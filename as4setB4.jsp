//as4setB4.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>14ii and 26ii</title>
<style>
	.my{
		color:red;
		font-size: 18;
	}
</style>
</head>
<body>
	<form action="" method="post">
		<input type="text" name="number" placeholder="Enter number">
		<input type="submit" value="add">
		
	</form>
	<%
		String no=request.getParameter("number");
		if(no!=null){
			int n=Integer.parseInt(no),last,first;
			last=n%10;
			while(n>=10){
				n=n/10;
			}
			first=n;
			int sum=first+last;
			out.println("<h1 class='my'>Sum will be"+sum+"</h1>");
		}
	
	%>

</body>
</html>
