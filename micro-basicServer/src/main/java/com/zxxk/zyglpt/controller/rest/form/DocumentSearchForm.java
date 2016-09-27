package com.zxxk.zyglpt.controller.rest.form;

public class DocumentSearchForm {

	private Long subjectid;
	
	private Long versionid;
	
	private Long textbookid;
	
	private Long booknode1id;
	
	private Long booknode2id;
	
	private Long booknode3id;
	
	private String orderby;

	public Long getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}

	public Long getVersionid() {
		return versionid;
	}

	public void setVersionid(Long versionid) {
		this.versionid = versionid;
	}

	public Long getTextbookid() {
		return textbookid;
	}

	public void setTextbookid(Long textbookid) {
		this.textbookid = textbookid;
	}

	public Long getBooknode1id() {
		return booknode1id;
	}

	public void setBooknode1id(Long booknode1id) {
		this.booknode1id = booknode1id;
	}

	public Long getBooknode2id() {
		return booknode2id;
	}

	public void setBooknode2id(Long booknode2id) {
		this.booknode2id = booknode2id;
	}

	public Long getBooknode3id() {
		return booknode3id;
	}

	public void setBooknode3id(Long booknode3id) {
		this.booknode3id = booknode3id;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}
	
}
