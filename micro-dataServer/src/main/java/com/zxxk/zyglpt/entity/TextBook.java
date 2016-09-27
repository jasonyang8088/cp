package com.zxxk.zyglpt.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity(name="b_text_book")
public class TextBook {

	@Id
	private Long id;
	
	@Column(length=20) 
	private String bookName;
	
	@ManyToOne
	@JsonDeserialize
	private Subject subject;
	
	@ManyToOne
	@JsonDeserialize
	private Version version;
	
	@JsonDeserialize
	private Byte status;
	
	@JsonDeserialize
	private Integer orderId;
	
	
	@OneToMany(mappedBy="textbook",cascade= CascadeType.REMOVE)
	@JsonIgnore
	private List<BookNode> booknodes;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public Version getVersion() {
		return version;
	}


	public void setVersion(Version version) {
		this.version = version;
	}


	public Byte getStatus() {
		return status;
	}


	public void setStatus(Byte status) {
		this.status = status;
	}


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public List<BookNode> getBooknodes() {
		return booknodes;
	}


	public void setBooknodes(List<BookNode> booknodes) {
		this.booknodes = booknodes;
	}
	
}
