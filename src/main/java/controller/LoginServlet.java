package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import service.LoginService;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		String kullaniciadi = request.getParameter("username");
		String parola = request.getParameter("password");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticateUser(kullaniciadi, parola);
		User user = loginService.getUserByUsername(kullaniciadi);
		if(result==true){
			request.getSession().setAttribute("user", user);
			response.sendRedirect("index.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}
	}

}
