package com.example.demo.controller;

//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TicketDao;
import com.example.demo.entity.Ticket;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController  {
	
	@Autowired(required = true)
	public TicketDao ticketDao;
	
	@GetMapping("/getTicket")
	public Ticket getTicketByID(@RequestParam("id") String id){
		 
		
		 Integer idVal = Integer.parseInt(id);
		 Ticket ticket = ticketDao.findOne(idVal);
		 
		 

	 return ticket;
		 
	 }
}
