<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OurGameList</title>
</head>
<body bgcolor='white'>
	<%
		int i = Integer.parseInt(request.getParameter("game1"));
		int j = Integer.parseInt(request.getParameter("game2"));
		
		int k = i+j;
			
		out.println("Output: " +k);
		
	%>
</body>
</html>