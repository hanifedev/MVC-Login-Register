<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		session.removeAttribute("userId");
		session.removeAttribute("password");
		session.invalidate();
	%>
<center>
	<h1>Çıkış yaptınız... Giriş Yapmak için </h1><a href="login.jsp">Tıkla</a>
</center>
<jsp:include page="script.jsp"></jsp:include>
</body>
</html>