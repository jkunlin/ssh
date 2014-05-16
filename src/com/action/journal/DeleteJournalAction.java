package com.action.journal;

import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

public class DeleteJournalAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5633845481826822556L;

	private Integer journal_id;
	private JournalService service;
	public Integer getJournal_id() {
		return journal_id;
	}
	public void setJournal_id(Integer journal_id) {
		this.journal_id = journal_id;
	}
	public JournalService getService() {
		return service;
	}
	public void setService(JournalService service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		service.delete_journal(journal_id);
		System.out.println(journal_id);
		return SUCCESS;
	}
	
}
