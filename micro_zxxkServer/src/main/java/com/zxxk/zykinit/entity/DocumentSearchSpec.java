package com.zxxk.zykinit.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity(name="b_document_search_spec")
public class DocumentSearchSpec {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Subject subject;

	@ManyToOne
	private Version version;

	@ManyToOne
	private TextBook textBook;
	
	@ManyToOne
	private BookNode booknode1;
	
	@ManyToOne
	private BookNode booknode2;
	
	@ManyToOne
	private BookNode booknode3;
	
	@ManyToMany(mappedBy = "documentSearchSpecs")
	private List<Document> documents;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public TextBook getTextBook() {
		return textBook;
	}

	public void setTextBook(TextBook textBook) {
		this.textBook = textBook;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
}
