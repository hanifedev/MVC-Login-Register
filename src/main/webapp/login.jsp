<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>LoveShopping | Login Page</title>
	<jsp:include page="header.jsp"></jsp:include>
</head>
 <body>
<div class="container">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="jumbotron">
			<h3>Lütfen Giriş Yapın</h3>
			<br>
				<form method="post" action="LoginServlet">
					<div class="form-group">
						<label>Kullanıcı Adı:</label>
						<input name="username" type="text" class="form-control">
					</div>
					<div class="form-group">
						<label>Parola:</label>
						<input name="password" type="password" class="form-control">
					</div>
					<button type="submit" class="btn btn-primary form-control">Giris Yap</button>
					<div class="kayit">
						<a href="register.jsp">Kayıt Ol</a>
					</div>
				</form>
			</div>
		
		</div>
</div>
<jsp:include page="script.jsp"></jsp:include>
 </body>
</html>