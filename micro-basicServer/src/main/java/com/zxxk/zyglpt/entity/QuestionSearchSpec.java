package com.zxxk.zyglpt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuestionSearchSpec {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="subject_id")
	private Long subjectId;
	
	@Column(name="version_id")
	private Long versionId;
	
	@Column(name="textbook_id")
	private Long textbookId;
	
	@Column(name="booknode1_id")
	private Long booknode1Id;
	
	@Column(name="booknode2_id")
	private Long booknode2Id;
	
	@Column(name="booknode3_id")
	private Long booknode3Id;
	
	@Column(name="bkp1_id")
	private Long bkp1Id;
	
	@Column(name="bkp2_id")
	private Long bkp2Id;
	
	@Column(name="bkp3_id")
	private Long bkp3Id;

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

	public Long getTextbookId() {
		return textbookId;
	}

	public void setTextbookId(Long textbookId) {
		this.textbookId = textbookId;
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

	public Long getBkp1Id() {
		return bkp1Id;
	}

	public void setBkp1Id(Long bkp1Id) {
		this.bkp1Id = bkp1Id;
	}

	public Long getBkp2Id() {
		return bkp2Id;
	}

	public void setBkp2Id(Long bkp2Id) {
		this.bkp2Id = bkp2Id;
	}

	public Long getBkp3Id() {
		return bkp3Id;
	}

	public void setBkp3Id(Long bkp3Id) {
		this.bkp3Id = bkp3Id;
	}
	
}
