package com.edu.entity;

import java.util.List;

public class QuestionType {
	
	private Long id;
	
	private String name;
	
	private byte isCailiao=0;
	
	private QuestionType parent;
	
	private List<QuestionType> children;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getIsCailiao() {
		return isCailiao;
	}

	public void setIsCailiao(byte isCailiao) {
		this.isCailiao = isCailiao;
	}

	public QuestionType getParent() {
		return parent;
	}

	public void setParent(QuestionType parent) {
		this.parent = parent;
	}

	public List<QuestionType> getChildren() {
		return children;
	}

	public void setChildren(List<QuestionType> children) {
		this.children = children;
	}

}


