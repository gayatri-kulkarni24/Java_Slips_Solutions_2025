//slip20_1.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>20i</title>
</head>
<body>
	<form method="post">
		<input type="text" name="number" placeholder="Enter a number">
		<input type="submit" value="Convert">
	</form>
	<font color="red">
	<%
		String no=request.getParameter("number");
		if(no!=null){
			for(int i=0;i<no.length();i++){
				char n=no.charAt(i);
				switch(n){
				case '0':out.println("Zero"); break;
				case '1':out.println("one"); break;
				case '2':out.println("two"); break;
				case '3':out.println("three"); break;
				case '4':out.println("four"); break;
				case '5':out.println("five"); break;
				case '6':out.println("six"); break;
				case '7':out.println("seven"); break;
				case '8':out.println("eight"); break;
				case '9':out.println("nine"); break;
				}
			}
		}else{
			out.print("Please enter number");
		}
	%>
	</font>
</body>
</html>
