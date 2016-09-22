package com.zxxk.zyk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class QuestionSearchSpec {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Subject subject;
	
	@ManyToOne
	private Version version;
	
	@ManyToOne
	private TextBook textbook;
	
	@ManyToOne
	private BookNode booknode1;
	
	@ManyToOne
	private BookNode booknode2;
	
	@ManyToOne
	private BookNode booknode3;
	
	@ManyToOne
	private BasicKnowledgePoint bkp1;
	
	@ManyToOne
	private BasicKnowledgePoint bkp2;
	
	@ManyToOne
	private BasicKnowledgePoint bkp3;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public TextBook getTextbook() {
		return textbook;
	}

	public void setTextbook(TextBook textbook) {
		this.textbook = textbook;
	}

	public BookNode getBooknode1() {
		return booknode1;
	}

	public void setBooknode1(BookNode booknode1) {
		this.booknode1 = booknode1;
	}

	public BookNode getBooknode2() {
		return booknode2;
	}

	public void setBooknode2(BookNode booknode2) {
		this.booknode2 = booknode2;
	}

	public BookNode getBooknode3() {
		return booknode3;
	}

	public void setBooknode3(BookNode booknode3) {
		this.booknode3 = booknode3;
	}

	public BasicKnowledgePoint getBkp1() {
		return bkp1;
	}

	public void setBkp1(BasicKnowledgePoint bkp1) {
		this.bkp1 = bkp1;
	}

	public BasicKnowledgePoint getBkp2() {
		return bkp2;
	}

	public void setBkp2(BasicKnowledgePoint bkp2) {
		this.bkp2 = bkp2;
	}

	public BasicKnowledgePoint getBkp3() {
		return bkp3;
	}

	public void setBkp3(BasicKnowledgePoint bkp3) {
		this.bkp3 = bkp3;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}
	
}
