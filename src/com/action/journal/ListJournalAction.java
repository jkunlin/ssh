package com.action.journal;

import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

public class ListJournalAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 113798207564591586L;
	private Integer article_id;
	private JournalService service;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		article_id += 0;
		return SUCCESS;
	}
}
