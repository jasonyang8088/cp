package com.zxxk.zyglpt.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name="b_document_search_spec")
public class DocumentSearchSpec {

	@Id
	private Long id;
	
	@Column(name="subject_id")
	private Long subjectId;

	@Column(name="version_id")
	private Long versionId;

	@Column(name="text_book_id")
	private Long textBookId;
	
	@Column(name="booknode1_id")
	private Long booknode1Id;
	
	@Column(name="booknode2_id")
	private Long booknode2Id;
	
	@Column(name="booknode3_id")
	private Long booknode3Id;
	
	@ManyToMany(mappedBy = "documentSearchSpecs")
	@JsonIgnore
	private List<Document> documents;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getVersionId() {
		return versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}

	public Long getTextBookId() {
		return textBookId;
	}

	public void setTextBookId(Long textBookId) {
		this.textBookId = textBookId;
	}

	public Long getBooknode1Id() {
		return booknode1Id;
	}

	public void setBooknode1Id(Long booknode1Id) {
		this.booknode1Id = booknode1Id;
	}

	public Long getBooknode2Id() {
		return booknode2Id;
	}

	public void setBooknode2Id(Long booknode2Id) {
		this.booknode2Id = booknode2Id;
	}

	public Long getBooknode3Id() {
		return booknode3Id;
	}

	public void setBooknode3Id(Long booknode3Id) {
		this.booknode3Id = booknode3Id;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
}
