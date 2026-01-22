//as4seta3.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>8ii</title>
<style type="text/css">
	.my{
		color:red;
	}
</style>
</head>
<body>
	<form action="#">
		<input type="text" name="number" placeholder="Enter Number">
		<input type="submit" value="check" >
	</form>
	<%
		String no=request.getParameter("number");
		if(no!=null){
			int n=Integer.parseInt(no),f=0;
			for(int i=2;i<n;i++){
				if(n%i==0){
					f=1;
					break;
				}
			}
			if(f==0){
				out.println("<h1 class='my'> Number is prime</h1>");
				
			}else{
				out.println("<h1 class='my'> Number is not prime</h1>");
			}
		}
	%>
	
</body>
</html>
