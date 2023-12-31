<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Tag Library </h2>
	
	<!-- Declarative Tags -->
	<%!
		int a;
		String st = "Jakarta";
		
		// Method declaration,
		int square()
		{
			return a*a;
		}
	%>
		
<!-- 	ScriptLet Tags -->	
<%
		out.println(a+" "+st);
		out.println(square());
		
		int b=10;
		for(int i=0; i<b; i++)
			System.out.println("Iam from Jakarta,"+i);
		
		session.setAttribute("session_name", "JSP");
	%>
	<form action="output.jsp">
		
	</form>
	<!-- Expression Tags -->
	<%= LocalDateTime.now() %>
	<%= square() %>
</body>
</html>