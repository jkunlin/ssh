package com.action.journal;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

public class ListJournalAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 113798207564591586L;
	private Integer journal_id;
	private JournalService service;


	public void setJournal_id(Integer journal_id) {
		this.journal_id = journal_id;
	}



	public void setService(JournalService service) {
		this.service = service;
	}



	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		List journal_list = service.find_all();
		request.put("journal_list", journal_list);
		if (journal_id == null) {
			journal_id = (Integer)((Object[])journal_list.get(0))[0];
		}
		request.put("journal_id", journal_id);
		List article_list = service.find_article_of_journal(journal_id);
		//System.out.println(article_list.get(0));
		request.put("article_list", article_list);
		/*
		request.put("journal_list", service.find_all_title());
		if (journal_id == null) {
			journal_id = service.find_first_journal_id();
		}
		List<Article> article_list = service.find_article_of_journal(1);
		//System.out.println(article_list.get(0).getArticle_id());
		request.put("article_list", article_list);
		*/
		return SUCCESS;
	}
}
