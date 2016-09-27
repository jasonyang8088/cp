package com.zxxk.zyglpt.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="b_subject")
public class Subject {
	
	@Id 
	private  Long id;
	
	private Byte stage;		//1：小学  2：初中  3：高中
	
	private Byte status;  //1 :正常  -1：失效
	
	@Column(length=6)
	private String subjectName;
	
	@OneToMany(mappedBy="subject")
	@JsonIgnore
	private List<Version> versions;
	
	@ManyToMany(mappedBy="subjects")
	@JsonIgnore
	private List<QuestionType> questionTypes;
	
	@OneToMany(mappedBy="subject")
	@JsonIgnore
	private List<BasicKnowledgePoint> bkps;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getStage() {
		return stage;
	}

	public void setStage(Byte stage) {
		this.stage = stage;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Version> getVersions() {
		return versions;
	}

	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}

	public List<QuestionType> getQuestionTypes() {
		return questionTypes;
	}

	public void setQuestionTypes(List<QuestionType> questionTypes) {
		this.questionTypes = questionTypes;
	}

	public List<BasicKnowledgePoint> getBkps() {
		return bkps;
	}

	public void setBkps(List<BasicKnowledgePoint> bkps) {
		this.bkps = bkps;
	}
	
}
