package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.RegisterService;

import model.User;

public class RegisterServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("isim");
		String surname = request.getParameter("soyisim");
		String email = request.getParameter("eposta");
		String kullaniciadi = request.getParameter("username");
		String parola = request.getParameter("password");
		User user = new User(name,surname,email,kullaniciadi,parola);
		try{
			RegisterService registerService = new RegisterService();
			boolean result = registerService.register(user);
			out.println("<html>");
	        out.println("<head>");      
	        out.println("<title>Kayıt Başarılı!</title>");    
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<center>");
	        if(result){
	             out.println("Giriş Yapmak İçin <a href=login.jsp>Buraya Tıkla</a>");
	         }else{
	             out.println("<h1>Kayıt Başarısız!</h1>");
	             out.println("Tekrar denemek için <a href=register.jsp>Buraya Tıkla</a>");
	         }
	        out.println("</center>");
	        out.println("</body>");
	        out.println("</html>");
	     } finally {       
	         out.close();
	     }
	}
}
