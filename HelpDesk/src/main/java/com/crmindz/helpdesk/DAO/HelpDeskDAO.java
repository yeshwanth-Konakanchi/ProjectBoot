package com.crmindz.helpdesk.DAO;

import java.util.List;
import java.util.Map;

import com.crmindz.helpdesk.entity.LoginDetails;
import com.crmindz.helpdesk.entity.Ticket;
import com.crmindz.helpdesk.entity.User;

public interface HelpDeskDAO {

	public String registerUser(User user);

	public List<Map<String, String>> getStatesInfo();

	public List<Map<String, String>> getUserTypeInfo();

	public List<LoginDetails> getLoginDetails(LoginDetails login);

	public List<Map<String, String>> getTicketcategoryInfo();

	public List<Map<String, String>> getTicketSubcategoryInfo(String ticketCategoryVal);

	public void createTicket(Ticket ticket, String sessionAttr);

	public String getFirstName(String userName);

	public List<Ticket> getTicketDetails(String userName);

	public String getUserType(String userName);

	public List<Ticket> getTicketDetailsForEmployee();

	public List<Ticket> getApprovedTicketDetailsForEmployee(int ticketID, String comments);

	public List<Ticket> getRejectedTicketDetailsForEmployee(int ticketID, String comments);

	public List<Ticket> getApprovedListTicketDetailsForEmployee();

	public List<Ticket> getRejectedListTicketDetailsForEmployee();
	
	public List<Ticket> getTicketDetailsById(int ticketID);
}