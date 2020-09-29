<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String mensagem	=	"Bem vindo, ";
	%>
	<%	out.println(mensagem);	%>
	<br	/>
	<%
	String login	=	"Sr(a).	(SEU NOME AQUI)";
	%>																
	<%=	login	%>
	<br	/>
	<%
	System.out.println("Tudo foi executado!");
	%>
</body>
</html>