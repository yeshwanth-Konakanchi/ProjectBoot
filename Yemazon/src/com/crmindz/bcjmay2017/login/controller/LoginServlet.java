package com.crmindz.bcjmay2017.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.bcjmay2017.login.service.LoginService;
import com.crmindz.bcjmay2017.yemazon.entity.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Login login = new Login();
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		login.setUserId(userid);
		login.setPassword(password);
		
		boolean result = LoginService.validateUser(login);
		
		if(result==true){
			
			out.println("login successful");
		}
		else
			out.println("login failed!");
		
		
		
	}

}
