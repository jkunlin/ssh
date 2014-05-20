package com.action.journal;

import java.util.Map;

import com.bean.Paragraph;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

@SuppressWarnings("serial")
public class modifyParagraphAction extends ActionSupport {
	private JournalService service;
	private Integer paragraph_id;
	private String content;
	
	public JournalService getService() {
		return service;
	}

	public void setService(JournalService service) {
		this.service = service;
	}

	public Integer getParagraph_id() {
		return paragraph_id;
	}

	public void setParagraph_id(Integer paragraph_id) {
		this.paragraph_id = paragraph_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	public String execute() throws Exception {
		Map session = (Map) ActionContext.getContext().get("session");
		Integer userid = (Integer)session.get("userid");
 		Paragraph paragraph = service.find_paragraph_by_paragraph_id(paragraph_id);
 		if (userid != paragraph.getUser().getUserid()) {
 			addFieldError("message", "这段东西又不是你写的，不能改它！");
 			return INPUT;
 		}
		paragraph.setContent(content);
		service.update_paragraph(paragraph);
		return SUCCESS;
	}
}
