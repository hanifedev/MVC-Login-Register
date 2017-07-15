<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="model.User" %>
<%@ page import="service.LoginService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Index JSP</title>
</head>
<body>
<center>
	<div id="container">
		<h1>Basit Giriş Sayfası</h1>
		<%
			User user = (User)session.getAttribute("user");
		%>
		<b>Welcome <%= user.getIsim() + " " + user.getSoyisim()%></b>
		<br>
		<a href="logout.jsp">Logout</a>
		<table>
			<thead>
				<tr>
					<th>User ID</th>
					<th>Adı</th>
					<th>Soyadı</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<% LoginService loginService = new LoginService();
				   List<User> list = loginService.getListOfUser();
				   for (User u : list){
			    %>
				<tr>
					<td><%= u.getKul_id() %></td>
					<td><%= u.getIsim() %></td>
					<td><%= u.getSoyisim() %></td>
					<td><%= u.getEmail() %></td>
				</tr>
				<%}%>
			</tbody>
		</table>
		<br>
	</div>
</center>
</body>
</html>