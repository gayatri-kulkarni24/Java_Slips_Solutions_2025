//slip28_1.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>28i</title>
</head>
<body>
	<form action="#" method="post">
		<input type="text" name="str" placeholder="Enter a String"><br>
		<input type="submit" value="submit">
	</form>
	<%
		String str=request.getParameter("str");
		if(str!=null){
			char[] arr=str.toCharArray();
			String rev="";
			for(int i=arr.length-1;i>=0;i--){
				rev+=arr[i];
			}
			out.print("Reversed String"+rev);
			
		}	
	%>
</body>
</html>
