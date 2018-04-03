package com.crmindz.bcjmay2017.registration.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crmindz.bcjmay2017.registration.service.RegistrationService;
import com.crmindz.bcjmay2017.yemazon.entity.Customer;
import com.crmindz.bcjmay2017.yemazon.entity.Login;

/**
 * Servlet implementation class RegistrationService
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Customer customer = new Customer();
		Login login = new Login();
		
		
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String emailId = request.getParameter("emailid");
		String phoneNumber = request.getParameter("phonenumber");
		String password = request.getParameter("password");
		
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmailId(emailId);
		customer.setPhoneNumber(phoneNumber);
		
		login.setUserId(emailId);
		login.setPassword(password);
		
		customer.setLogin(login);
		
		Customer customer1 = RegistrationService.registerCustomer(customer,login);
		if(customer1.getLogin().getAccountNo()!= null){
			out.println("<html><body>");
			out.println("<a href=login.html>login page</a>");
			out.println("</body></html>");
			
		}
		else{
			out.println("Restration Failed! Try again");
		}
	}

}
