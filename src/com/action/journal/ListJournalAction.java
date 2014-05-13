package com.action.journal;

import java.util.List;
import java.util.Map;

import com.bean.Article;
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



	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		@SuppressWarnings("rawtypes")
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("journal_list", service.find_all_title());
		List<Article> article_list = service.find_article_of_journal(1);
		System.out.println(article_list.get(0).getArticle_id());
		request.put("article_list", article_list);
		return SUCCESS;
	}
}
