package com.service;

import java.sql.Date;
import java.util.List;

import com.bean.Ticket;
import com.dao.Page;
import com.dao.TicketDao;

public class TicketManageService {
	
	public void insertTicket(String ipccustomer,String customercode,String cause,String summary,String componenttype,String ostype,
			String identifier,String ticketstatus,Date lastoccurrence,String node,String resolution,String servername,String alertgroup,
			String component,Date firstoccurrence,String ticketnumber,String severity) {
		Ticket ticket=new Ticket();
		ticket.setIpccutomer(ipccustomer);
		ticket.setCustomercode(customercode);
		ticket.setCause(cause);
		ticket.setSummary(summary);
		ticket.setComponenttype(componenttype);
		ticket.setOstype(ostype);
		ticket.setIdentifier(identifier);
		ticket.setTicketstatus(ticketstatus);
		ticket.setLastoccurrence(lastoccurrence);
		ticket.setNode(node);
		ticket.setResolution(resolution);
		ticket.setServername(servername);
		ticket.setAlertgroup(alertgroup);
		ticket.setComponent(component);
		ticket.setFirstoccurrence(firstoccurrence);
		ticket.setTicketnumber(ticketnumber);
		ticket.setSeverity(severity);
		TicketDao ticketDao=new TicketDao();
		ticketDao.insert(ticket);
	}
	
	public List<Ticket> queryByDate(Date date1,Date date2,int currentPage){
		Ticket ticket1=new Ticket();
		Ticket ticket2=new Ticket();
		Page page=new Page();
		page.setCurrentPage(currentPage);
		page.setPerPageRows(5);
		ticket1.setFirstoccurrence(date1);
		ticket2.setFirstoccurrence(date2);
		TicketDao ticketDao=new TicketDao();
		return ticketDao.queryByDate(ticket1, ticket2,page);
	}
	public int exportExcel(Date date1,Date date2) {
		Ticket ticket1=new Ticket();
		Ticket ticket2=new Ticket();
		ticket1.setFirstoccurrence(date1);
		ticket2.setFirstoccurrence(date2);
		TicketDao ticketDao=new TicketDao();
		List<Ticket> tickets=ticketDao.queryByDate(ticket1, ticket2);
		return ticketDao.exportExcel(tickets);
	}
	//导入工作票到数据库
	public void importExcel(String path) {
		TicketDao ticketDao=new TicketDao();
		List<Ticket> tickets=ticketDao.importExcel(path);
		for(Ticket ticket:tickets) {
			ticketDao.insert(ticket);
		}
	}
	//查看所有工作票
	public List<Ticket> findAllTickets(int currentPage){
		Page page=new Page();
		page.setCurrentPage(currentPage);
		page.setPerPageRows(10);
		TicketDao ticketDao=new TicketDao();
		return ticketDao.findAllTickets(page);
		
	}
	

}
