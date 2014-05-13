package com.action.journal;

import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

public class ListJournalAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 113798207564591586L;
	private JournalService service;



	public void setService(JournalService service) {
		this.service = service;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
}
