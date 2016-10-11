package com.edu.entity;

import java.util.List;

public class Question {

	private Long id;
	
	private String stem;
	
	private String option;
	
	private String answer;
	
	private String analyse;
	
	private String comment;
	
	private Long subjectId;
	
	private byte isCailiao=0;
	
	private Question parent;
	
	private List<Question> children;
	
	private List<QuestionBookNodeSearchSpec> bookNodeSearchSpecList;

	private List<QuestionKnowledgePointSearchSpec> knowledgePointSearchSpecList;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStem() {
		return stem;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public void setStem(String stem) {
		this.stem = stem;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnalyse() {
		return analyse;
	}

	public void setAnalyse(String analyse) {
		this.analyse = analyse;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<QuestionBookNodeSearchSpec> getBookNodeSearchSpecList() {
		return bookNodeSearchSpecList;
	}

	public void setBookNodeSearchSpecList(List<QuestionBookNodeSearchSpec> bookNodeSearchSpecList) {
		this.bookNodeSearchSpecList = bookNodeSearchSpecList;
	}

	public List<QuestionKnowledgePointSearchSpec> getKnowledgePointSearchSpecList() {
		return knowledgePointSearchSpecList;
	}

	public void setKnowledgePointSearchSpecList(List<QuestionKnowledgePointSearchSpec> knowledgePointSearchSpecList) {
		this.knowledgePointSearchSpecList = knowledgePointSearchSpecList;
	}
}
