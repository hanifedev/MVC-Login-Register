<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
 	<jsp:include page="header.jsp"></jsp:include>
 </head>
 <body>
<div class="container">
		<div class="container">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="jumbotron">
			<h4>Lütfen Bilgilerinizi Girin</h4>
			<br>
				<form method="post" action="RegisterServlet">
					<div class="form-group">
						<label>İsim:</label>
						<input name="isim" type="text" class="form-control">
					</div>
					<div class="form-group">
						<label>Soyisim:</label>
						<input name="soyisim" type="text" class="form-control">
					</div>
					<div class="form-group">
						<label>Email:</label>
						<input name="eposta" type="text" class="form-control">
					</div>
					<div class="form-group">
						<label>Kullanıcı Adı:</label>
						<input name="username" type="text" class="form-control">
					</div>
					<div class="form-group">
						<label>Password:</label>
						<input name="password" type="password" class="form-control">
					</div>
					<button type="submit" class="btn btn-primary form-control">Kayıt Ol</button>
				</form>
			</div>
		</div>
	</div>
	</div> 	
 </body>
</html>